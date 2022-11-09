package com.planEEZy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class organizerUtil {
	
	
public static List<organizer> displayOrganizer(){
		
		ArrayList<organizer> org= new ArrayList<>();
		
		try {
		
			Connection con=DBConnectionUtil_DI.getConnection();
			Statement st= con.createStatement();

			String sql="select * from organizer";
			ResultSet value= st.executeQuery(sql);
			
			while(value.next()) {
			
				int id=value.getInt(1);
				String name=value.getString(2);
				String address=value.getString(3);
				String Phone=value.getString(4);
				String Email=value.getString(5);
		
				System.out.println(name);
				organizer organizer= new organizer(id,name,address,Phone,Email);
				
				org.add(organizer);
			
			}
			
			
		}
          catch(Exception e){
			
			e.printStackTrace();
		}
		return org;	
		
}

public static boolean updateProfile(String name, String mobile, String address, String email) {
	boolean isSuccess = false;//store whether data updated or not
	
	try {
		Connection con = DBConnectionUtil_DI.getConnection();//create connection
		Statement stat = con.createStatement();//create statement
		
		String sql = "UPDATE organizer SET Name = '"+name+"', Address = '"+address+"' Phone = '"+mobile+"',Email = '"+email+"',WHERE organizerID = '"+eventID+"'";//command for set edited data
		int rs = stat.executeUpdate(sql);//Execute the query
		
		if(rs>0) {
			isSuccess = true;
			System.out.println(isSuccess);//if success
		}else {
			isSuccess = false;
			System.out.println(isSuccess);//if unsuccess
		}
	}
	// Catch block is used for exception
	catch (Exception e){
		System.out.println("Couldn't update!!");//display a message
		// Print exception pop-up on the screen
		System.out.println(e);
	}

	return isSuccess;// return true or false
}

public static boolean deleteEvent(int id) {
	boolean isSuccess = false;
		
	try {
		Connection con = DBConnectionUtil_DI.getConnection();//create connection
		Statement stat = con.createStatement();//create statement
			
		String sql = "DELETE FROM event WHERE organizerID='"+id+"'";//command for set edited data
		int rs = stat.executeUpdate(sql);//Execute the query
			
		if(rs>0) {
			isSuccess = true;
			System.out.println(isSuccess);//if success
		}else {
			isSuccess = false;
			System.out.println(isSuccess);//if unsuccess
		}
	}
	// Catch block is used for exception
	catch (Exception e){
		System.out.println("Couldn't delete!!");//display a message
		// Print exception pop-up on the screen
		System.out.println(e);
	}

	return isSuccess;// return true or false
}


}
