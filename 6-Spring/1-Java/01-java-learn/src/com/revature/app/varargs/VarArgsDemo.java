package com.revature.app.varargs;

public class VarArgsDemo {

	public static void main(String[] args) {
		System.out.println(add(1, 2, 3, 5));

	}
	//var args can be defined using ... operator
	//var args should be defined as last parameter
	//multiple var args are not supported
	public static int add(int ... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
		
	}
	
}
