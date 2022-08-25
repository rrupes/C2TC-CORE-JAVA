package com.coreprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Palindrome");
		int number=sc.nextInt();
		int temp=number;  // further number value should not be changed. copying number value to temp 
		int remainder;
		int reverse=0;
		
		while(temp!=0)
		{
			remainder=temp%10; // to find remainder
			reverse=reverse*10+remainder; // adding remainder to reverse
			temp=temp/10;   // to check conditon
			
		}
		if(reverse==number) // comparing
		{
			System.out.println("is palindrome");
			
		}else
			{
			System.out.println("is not palindrome");
			
	}

}
	
}
