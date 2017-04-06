package com.pi.learning.language;

public class ArrayExample {

	public static void main(String[] args) {
		
		
	
		int [][] abc = {{10,11},{11,12},{34,35,38}};
		int  [] xyz  = new int[2];
		
		xyz[0] = 10;
		xyz[1] = 11;
		xyz[2] = 100;
		
		
		
		System.out.println("Lenght of my array is = "+abc.length);
		
		System.out.println("Lenght of my array is = "+abc[0][1]);//11
		System.out.println("Lenght of my array is = "+abc[1][0]);//11
		System.out.println("Lenght of my array is = "+abc[2][2]);//35
		System.out.println("Lenght of my array is = "+abc[2][2]);//35


System.out.println("Gautam has change something");	

	}
}
