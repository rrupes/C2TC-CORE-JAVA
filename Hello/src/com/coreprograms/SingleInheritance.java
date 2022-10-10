package com.coreprograms;

public class SingleInheritance {

	
	public static void main(String[] args) {
		B obj=new B();
		obj.a=10;
		obj.b=20; 
		
	System.out.println(obj.a);
	System.out.println(obj.display()); 
	}
	}
class A{
	int a,b;
	int display()
	{
		System.out.println("From class A"+ a+" "+"b"+ b);
		return 0;
		
	}
	
}
class B extends A{
	
	int c;
	void show()
	{
		
	}
}

	