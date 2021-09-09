package com.revature.app.inheritance;

public class Parent {
	
	//protected
	//When Parent class is used in another class, age is private.
	//When parent class instance variable is used in child class it can directly accessed.
	
	protected int age;
	public Parent(int age) {
		System.out.println("Parent constructor");
		this.age = age;
		
	}
	
	public void instanceMethod() {
		System.out.println("Parent instanceMethod()");
	}

}
