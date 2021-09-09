package com.revature.app.abstarction;

public class InterfaceImplementation implements Interface{
	public void abstractMethod() {
	
			System.out.println("Interface implementation abstractMethod()");
			
	}
	
	public static void main(String[] args) {
		Interface interface1 = new InterfaceImplementation();
		interface1.abstractMethod();
	}

}
