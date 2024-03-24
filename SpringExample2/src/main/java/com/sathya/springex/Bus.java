package com.sathya.springex;

public class Bus implements Vehicle{
	private String busType;
	private int maxSpeed;
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("You have selected Bus Vehicle");
		System.out.println("Max Speed..."+maxSpeed);
		System.out.println("Fuel Type..."+busType);
	}
}
