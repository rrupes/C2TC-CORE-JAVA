package com.Lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		
		
		// " ()-> " It is Lambda Expression and only used with functional Interface
		//   Functional Interface Means Interface only have 1 method
 Abc l=()->{
	 System.out.println("Lambda Demo Example");
 };
 l.show();
	

	
	
	Bcd b=()->{
		System.out.println("Display Bcd interface");
	};
	b.display();
	}
}

interface Abc{
	void show();
	
	
}

interface Bcd{
	void display();
}