package com.sapient.test.helper;

public class TV {
	
	private String owner;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	
	public TV(String name){
		owner=name;
 	
	}
	
	public void on(){
		System.out.println(owner+" TV on"); // method overloading
		
	}

}
