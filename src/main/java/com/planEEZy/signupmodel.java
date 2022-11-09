package com.planEEZy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class signupmodel {
	
	public static boolean signupdetails(String uname,String address,String umobile,String email){
		
		boolean result=false;
		
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
		
			Statement st= con.createStatement();
			String sql="insert into Organizer"+ " values('0'"+","+"'"+uname+"','"+address+"','"+umobile+"','"+email+"')";
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
