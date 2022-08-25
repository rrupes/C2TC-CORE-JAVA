package com.coreprograms;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();   
		int remainder;
		int temp=number;     // swap number to temp
		int m=0;      // taking int m to check armstrong number
		
		
		while(temp>0)
		{
			remainder=temp%10;   // to find remainder
			 m=m+remainder*remainder*remainder;   // adding remainder
			temp=temp/10;   // to check condition for iteration
			
		}
		if(m==number)   // comparing 
		{
			System.out.println("is armstrong number");
			
			
		}else
		{
			System.out.println("is NOT armstrong number");
		}
			
			
			
			
	}

}
