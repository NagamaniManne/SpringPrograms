package com.sathya.springex;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("This is Sring framework first application.....");
	}
	public GreetingImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting constructor :: object created");
	}
}
