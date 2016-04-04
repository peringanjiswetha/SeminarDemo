package com.seminar;

public class Contact extends Person {
	public String phoneNumber;
	public String emailId;
	
	public Contact(String firstName, String lastName, String phoneNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
}
