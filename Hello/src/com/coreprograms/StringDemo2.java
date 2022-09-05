package com.coreprograms;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1=new String("Rupesh");   //using new operator
		String s2=new String("Rupesh");
		String s3=new String("Rup");
		String s4=new String("RUPESH");

		System.out.println(s1.compareTo(s2));   
		System.out.println(s1.compareTo(s3));
	System.out.println(s1.equalsIgnoreCase(s4));    
	
}
}