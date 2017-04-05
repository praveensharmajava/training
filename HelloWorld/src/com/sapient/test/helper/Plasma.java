package com.sapient.test.helper;

public class Plasma extends TV {
	
	private boolean remote;
	
	public Plasma() {
		// TODO Auto-generated constructor stub
	}
	public Plasma(String name, boolean withRemote){
		
		super(name);
		remote = withRemote;
	}
	
	public void timer(){
		System.out.println("timer on");
	}
	
	public void on(){
		//method overriding
		remote = true;
		System.out.println("method overriden"+remote+" TV on"); // method overloading
		super.on();
		
	}
	

}
