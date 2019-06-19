package com.slokam.automation.tests.sample2;

public class Ops {

	public static void main(String[] args) {
		
		
		X x1 = new A();
		x1.start();
		
		X x2 = new X() {
			public void start() {
				System.out.println("I am in custom class");
			}
		};
		
		x2.start();
	}
	
	class Temp {
		
	}
	
}


