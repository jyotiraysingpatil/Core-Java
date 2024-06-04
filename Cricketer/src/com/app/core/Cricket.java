package com.app.core;

public class Cricket {
	private String name;
    private int age;
    private String email;
    private String phoneNo;
    private int rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	public Cricket(int rating) {
		super();
		this.rating = rating;
	}
	public Cricket(String name, int age, String email, String phoneNo, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Cricket [name=" + name + ", age=" + age + ", email=" + email + ", phoneNo=" + phoneNo + ", rating="
				+ rating + "]";
	}
	

	
	@Override
	public boolean equals(Object o) {
		System.out.println("in Cricket equals");
		if(o instanceof Cricket) {
			return this.name==((Cricket)o).name;
			
		}
		return false;
	}
}
