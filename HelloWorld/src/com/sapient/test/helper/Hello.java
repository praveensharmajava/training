package com.sapient.test.helper;

public class Hello {

	public static void main(String[] args) {

		TV tv = new Plasma();
		tv.on();

		// Parent class ka reference child class ke object ko refer ka
	}

	// call by value and call by reference

	public static TV buyTelevsion(int a) {
		if (a > 10) {
			return new LED();
		} else {
			return new Plasma();
		}
		// System.out.println(c);

	}

}

// Inheritance --- > extends
// abstraction -- >
// encapsulation
// Polymorphim