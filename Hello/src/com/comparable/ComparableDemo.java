package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args)
	{
		ArrayList<Emp> a=new ArrayList<Emp>();  // Emp is class created below so that we can store object
		// Adding Objects of "Class Emp" that why using "new Emp" while adding Element 
		a.add(new Emp("Avinash",40000.0));   
		a.add(new Emp("Rahul",50000.1));
		a.add(new Emp("Rupesh",20000));
		a.add(new Emp("Sanket",60000));
		a.add(new Emp("Sagar",10000));
		
		System.out.println("Before Sorting");
		System.out.println(a);
		
		System.out.println("After Sorting on basis of salary");
		Collections.sort(a);
		System.out.println(a);
		
	}

}
class Emp implements Comparable<Emp>  // Implementing comparable
{
	
	int eid;
	String ename;
	double sal;
	static int i;
	
	
	

	public Emp() 
	{
		eid=eid++;
		ename="unknown";
		sal=0.0;
		
	}

    // Parameterized Constructor
	public Emp(String Ename, double Sal) {
		
	
	ename = Ename;
	sal = Sal;
	}
	
	
	


	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Emp o) {
		if(this.sal==((Emp)o).sal)
			return 0;
		
		else if(this.sal>((Emp)o).sal)
			return 1;
		else
		return -1;
		
		
	}

/*	@Override
	public int compareTo(Emp o) {
		if(this.sal==((Emp)o).sal)
      return 0;
		
		else if (this.sal>((Emp)o).sal)
			return 1;


		else
		return -1;
		*/
	}



