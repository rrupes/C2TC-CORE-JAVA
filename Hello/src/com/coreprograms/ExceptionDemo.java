package com.coreprograms;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println(5+5);
			System.out.println(2/0); // exception
			System.out.println(3);
		}
	/*	catch(ArithmeticException e)
		{
			System.out.println(2/2);
			System.out.println("Inside Catch Block");
		}
		*/
		finally {
			System.out.println("I am finally Block");
		}
		System.out.println("I am remaining code");
	}

}
