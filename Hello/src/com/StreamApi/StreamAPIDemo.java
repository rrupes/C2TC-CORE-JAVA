package com.StreamApi;

import java.util.ArrayList;
import java.util.List;


// Without StreamAPI Functions and methods

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(9);
		l.add(16);
		l.add(91);
		l.add(34);
		l.add(45);
		l.add(56);
		l.add(69);
		l.add(97);
		l.add(81);
		l.add(98);
		System.out.println("Original List: "+l);
		
		
		List<Integer> evenList=new ArrayList();
		for(Integer i:l)   // for each loop
		{
			if(i%2==0) 
			{
				evenList.add(i);    
			}
			
		}System.out.println("Even number from above list is : "+evenList);
		

	}

}
