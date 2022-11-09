package com.planEEZy;

public class organizer {
	
	private int organizerID;
	private String Name;
	private String Phnnumber;
	private String Email;
	private String address;
	
	
	public organizer(int id,String name,String address,String phn,String email) {
		
		this.organizerID=id;
		this.Name=name;
		this.address=address;
		this.Phnnumber=phn;
		this.Email=email;
		
	
	}




	public int getOrganizerID() {
		return organizerID;
	}



	public String getName() {
		return Name;
	}




	public String getPhnnumber() {
		return Phnnumber;
	}





	public String getEmail() {
		return Email;
	}


	public String getaddress() {
		return address;
	}

	
	

}
