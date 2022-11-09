package com.planEEZy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;


public class signinmodel {
	
public static boolean signindetails(String uname,String password, String type){
		
		boolean result=false;
		
		
		
		
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DBConnectionUtil_DI.getConnection();
		
			Statement st= con.createStatement();
			String sql="insert into signup(uname,password,type)"+ " values('"+uname+"','"+password+"','"+type+"')";
			int value= st.executeUpdate(sql);
			
			
			
			
			if(value>0) {
				result=true;
				
			}
		}
		catch(Exception e){
			
			e.printStackTrace();
		}	
		
		return result;

}
}
