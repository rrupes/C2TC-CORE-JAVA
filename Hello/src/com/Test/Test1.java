package com.Test;

import java.util.Scanner;

public class Test1 {
	static Scanner sc=new Scanner(System.in);
  
	static int x=sc.nextInt();
	
	public static int Square(int x)
	{
		return x*x;
		
	}
	
	

	public static void main(String[] args) {
		
		
		System.out.println("Square of given number is"+ Square(x));

	}

}
