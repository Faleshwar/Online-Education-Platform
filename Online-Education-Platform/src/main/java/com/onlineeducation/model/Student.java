package com.onlineeducation.model;

public class Student {
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNo=" + phoneNo + "]";
	}

	private int Id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNo;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Student(int id, String firstName, String lastName, String email, String phoneNo) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Student() {
		super();
	}
	
	

}
