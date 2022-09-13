package com.coreprograms;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Rupesh");
		a.add("S");
		a.add(9);
		System.out.println(a);

		a.remove(2);
		System.out.println( a);
	}

}