package com.revature.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {

	public static void main(String[] args) {
		//Integer age = new Integer(10);//Wrapper Class
		Integer age = 10;
		ArrayList<Integer> al = new ArrayList<>();
		//<int> --> generics
		al.add(78);
		al.add(34);
		al.add(45);
		al.add(12);
		al.add(23);
		
		for (Integer number : al) {
			System.out.println(number);
		}
		al.set(1, 95);
		System.out.println("\nUsing index");
		for (int i = 0; i <= al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("\nSorted");
		Collection.sort(al);
		for(Integer number : al) {
			System.out.println(number);
		}
		/*al.add(new Person('John', 15); 
		al.add('John');
		al.add(1).//Auto Boxing*/
		
		

	}

}
