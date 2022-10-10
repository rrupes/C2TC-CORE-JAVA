package com.coreprograms;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) 
	{
		List<Integer>List1=Arrays.asList(12,75,57,9,3,52);
		List<Double>List2=Arrays.asList(9.1,2.5,12.4,30.5,57.9);
		display(List1);
		display(List2);

	}
	static void display(List<?>List)  //Unknoiwn Type
	{
		System.out.println(List);
	}

}
