package com.sathya.springex;

public class Person {
	private String name;
	private String emailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void personInfo()
	{
		System.out.println("Hey, "+name+" Welcone to SathyaTech");
		System.out.println("You will get the upates to your email..."+emailId);
	}
}
