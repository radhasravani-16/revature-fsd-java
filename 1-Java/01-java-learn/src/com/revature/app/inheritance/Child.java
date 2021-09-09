package com.revature.app.inheritance;

public class Child extends Parent{
	//extends will inherit from parent class. 
	//Extends gets all protected instance variables and method available in the parent to the child.
    //Super keyword in the child is used to refer the immediate parent class from the child.
	public Child(int age) {
		super(age);
		
	}
	
	public void childInstanceMethod() {
		super.instanceMethod();
		System.out.println("childInstanceMethod()");
		System.out.println(age);
	}
	
	//Method Overloading is the child class having a method signature same as parent class instance method.
	public void instanceMethod() {
	    super.instanceMethod();
		System.out.println("child instanceMethod()");
	}
	public static void main(String[] args) {
		
		Child child = new Child(10);
		child.instanceMethod();
		//child.instanceMethod();
		//System.out.println(child.age);
		
		//Runtime Polymorphism is that the child class instance is assigned to parent class -
		//- reference and the overriden method is called fro parent class reference.
		Parent parent = new Child(20);
		parent.instanceMethod();
		
	}
	
	

}
