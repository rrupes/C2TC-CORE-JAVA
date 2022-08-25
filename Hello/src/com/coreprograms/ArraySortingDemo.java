package com.coreprograms;

import java.util.Arrays;

public class ArraySortingDemo {

	public static void main(String[] args) {

		int []arr= {10,3,70,75,43,45,17,2,99};
		
		System.out.println("Entered array is= ");
		
		for(int number:arr)
		{
			System.out.println(number+" ");
		}
		Arrays.sort(arr);      // Taking Arrays class and its method sort
		{
			System.out.println("Sorted Array is=");
			for(int number:arr)
			{
				
				System.out.println(number);
			}
			
			
		}
		
	}

}
