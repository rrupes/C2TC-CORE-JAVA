package com.coreprograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value ");
		String s=sc.next();
		
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
		}
		
		if(s.equals(reverse))
		{
			System.out.println("Is Palindorme");
			
		}
		else 
		{
			System.out.println("is not Palindrome");
		}
		
		System.out.println(reverse);
	}

}
