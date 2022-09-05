package com.coreprograms;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		if(age<18)
		{
			throw new CantVote("YOU CANNOT VOTE AS YOU ARE UNDER 18 YEARS OF AGE!!!"); // creating customized exception
			
		}else
		{
			System.out.println("You can vote !!!");
			
		}
		
	}

}

class CantVote extends RuntimeException{

	public CantVote(String msg) {
		super(msg);
		
	}
	
	
	
}