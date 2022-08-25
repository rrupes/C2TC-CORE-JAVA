package com.coreprograms;

public class StringDemo {
public static void main(String[] args) {
	
 String s=new String("Rupesh");
	s.concat("Kushawaha");
	  // immutable
	System.out.println(s);
	
	
	
	StringBuffer bf=new StringBuffer("Rupesh ");
	bf.append("Kushawaha ");
	// Mutable
	System.out.println(bf);
	
}
}