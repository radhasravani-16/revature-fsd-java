package com.revature.app.abstarction;

public abstract class AbstractClass {
	private int age;
	
	public AbstractClass(int age) {
		super();
		this.age = age;
	}
	
	abstract void abstractMethod();
	
	public void instanceMethod() {
		System.out.println("Abstract Class instanceMethod");
	}

}

//Abstract class cannot be instantiated.
//Abstract methods can be defines in an abstract class.
//When inheriting an abstract class, the child class should be defined as abstract.
