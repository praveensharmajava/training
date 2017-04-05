package com.sapient.test.helper;

public class LED extends TV {
	
	private boolean isSmart;
	
	
	public LED() {
		// TODO Auto-generated constructor stub
	}
	public LED(String name , boolean isSmartTV) {
		super(name);
		this.isSmart = isSmartTV;
		// TODO Auto-generated constructor stub
	}
	
	public void clickPhoto(){
		System.out.println("photo clicked");
	}
}


