package com.revature.exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();//Unchecked Exception (does not force to handle the exception).
			System.out.println(age);
		}catch(InputMismatchException e) {
			
			System.out.println("Enter valid number");
		}
			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			System.out.println(sdf.parse("01/01a/2021"));//Checked Exception (force to handle the exception).
		}catch(ParseException e) {
			System.out.println("Enter date in dd/mm/yyyy format.");
		}
	}
	public void methodThrowingException(int age) throws CustomException {
		if(age < 0) {
			throw new CustomException("'age' cannot be negative.");
			
		}
		System.out.println("Method processing.............");
	}

}
