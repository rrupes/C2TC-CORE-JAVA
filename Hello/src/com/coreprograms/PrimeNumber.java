package com.coreprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter Number to Check Prime Number");
		int n=s.nextInt();
		int temp=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
				
			}
			
		}
		if(temp>0) 
		{
			System.out.println(n+" is not prime no");
			
		}else
		{
			System.out.println(n+" is prime number");
		}
			
		
	}

}
