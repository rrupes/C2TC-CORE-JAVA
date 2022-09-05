package com.coreprograms;

public class AddDemo1 {
	
	public static void main(String[] args) {
		    
	/*	int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		 
		
		
		System.out.println(a+b);
		System.out.println(a+b+c);
		System.out.println(a+b+c+d);
		System.out.println(a+b+c+d+e);
	*/


	A1 a1=new A1();
	System.out.println(a1.add());
	
	A2 a2=new A2();
	System.out.println(a2.add());
	
	A3 a3=new A3();
	System.out.println(a3.add());
	
	A4 a4=new A4();
	System.out.println(a4.add());
	
}
}
class A1{
	int a=10;
	int b=20;
public int add() {
	return a+b;
	
}
}
class A2 extends A1{
	//int a=10;
	//int b=20;
	int c=30;
	public int add() {
		return a+b+c;
		
	}
	
}
class A3 extends A2{
	
	int d=40;
	public int add() {
		return a+b+c+d;
	}
}
class A4 extends A3{
	
	int e=50;
	public int add() {
		return a+b+c+d+e;
	}
}

