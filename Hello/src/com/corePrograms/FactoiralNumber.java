package com.corePrograms;

import java.util.Scanner;

public class FactoiralNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check Factorial");
		int n=s.nextInt();
		int factorial=1;
		
		for(int i=n;i>0;i--)
		{
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
		
	}

}
