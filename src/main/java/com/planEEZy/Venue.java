package com.planEEZy;

public class Venue {
	private int  id;
	private String location;
	private String name;
	private int capacity;
	private String status;
	private String place;
	private String description;
	private String owner;
	private int hotline;
	private String email;
	private String website;
	private int incharge;
	
	
	
	



	public Venue(int id, String location, String name, int capacity, String status, String place, String des,
			String owner, int hotline, String email,String website,int incharge) {
		
		this.id=id;
		this.location=location;
		this.name=name;
		this.capacity=capacity;
		this.status=status;
		this.place=place;
		this.description=des;
		this.owner=owner;
		this.hotline=hotline;
		this.email=email;
		this.website=website;
		this.incharge=incharge;
		
		

		
	}

	public int getId() {
		return id;
	}



	public String getLocation() {
		return location;
	}



	public String getName() {
		return name;
	}


	public int getCapacity() {
		return capacity;
	}


   public String getStatus() {
		return status;
	}


 public String getPlace() {
		return place;
	}


public String getDescription() {
		return description;
	}


public String getOwner() {
		return owner;
	}




public int getHotline() {
		return hotline;
	}


public String getEmail() {
		return email;
	}


public String getWebsite() {
		return website;
	}




public int getIncharge() {
		return incharge;
	}


}
