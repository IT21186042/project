package com.planEEZy;

import java.sql.Connection;
import java.sql.Statement;

public class AvenueUtil {
	
	public static boolean DisplayAvenue(String name) {
		boolean isSuccess = false;//store whether data updated or not
		
		int id=Integer.parseInt(name);
		
		try {
			Connection con = DBConnectionUtil_DI.getConnection();//create connection
			Statement stat = con.createStatement();//create statement
			
			String sql = "Selecct * from venue where venueID = '"+id+"'";//command for set edited data
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

}
