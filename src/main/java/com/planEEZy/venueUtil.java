package com.planEEZy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class venueUtil {
	
public static List<Venue> displayvenue(){
		
		ArrayList<Venue> ven= new ArrayList<>();
		
		try {
		
			Connection con=DBConnectionUtil_DI.getConnection();
			Statement st= con.createStatement();
			String sql="select * from Venue";
			ResultSet value= st.executeQuery(sql);
			
			while(value.next()) {
			
				int id=value.getInt(1);
				String location=value.getString(2);
				String name=value.getString(3);
				int capacity=value.getInt(4);
				String status=value.getString(5);
				String place=value.getString(6);
				String des=value.getString(7);
				String owner=value.getString(8);
				int hotline=value.getInt(9);
				String email=value.getString(10);
				String website=value.getString(11);
				int incharge=value.getInt(12);
				
				Venue ve= new Venue(id,location,name,capacity,status,place,des,owner,hotline,email,website,incharge);
				
				ven.add(ve);
			
			}
			
			
		}
			
			
	
		catch(Exception e){
			
			e.printStackTrace();
		}
		return ven;	
		
}

}	






