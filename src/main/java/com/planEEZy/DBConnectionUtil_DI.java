package com.planEEZy;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil_DI {

	
	private static String URL = "jdbc:mysql://localhost:3306/project";//here this planeezy isthe database name
	private static String username = "root";//I think will be default the same as root
	private static String Password = "1234"; //change Your password
	private static Connection con;//this is connection instant = "con"
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//this is the mysql jdbc driver(I think this won't be changed)
			con = DriverManager.getConnection(URL, username, Password);
			
		}catch(Exception e) {
			System.out.println("Database Connection isn't Success!!!");
		}
		
		return con;
		
	}

}
