package com.coreprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Reverse");
		int number=sc.nextInt();
		int remainder;
		int reverse=0;
		
		while(number>0)
		{
			remainder=number%10;   // to find remainder
			reverse=reverse*10+remainder;  // adding remainder in reverse
			number=number/10;   // to check condititon
			
		}
		System.out.println(reverse);
				
			
			
				
	}

}
