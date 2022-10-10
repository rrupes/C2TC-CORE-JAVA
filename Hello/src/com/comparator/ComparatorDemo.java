package com.comparator;

import java.util.Arrays;import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		
		e[0]=new Employee();
		e[0].setAge(25);
		e[0].setName("Rupesh");
		e[0].setPlace("Mumbai");
		
		
		e[1]=new Employee();
		e[1].setAge(45);
		e[1].setName("Nitesh");
		e[1].setPlace("Goa");
		
		e[2]=new Employee();
		e[2].setAge(35);
		e[2].setName("Arind");
		e[2].setPlace("Surat");
		
		System.out.println("Before Sorting");
		for(int i=0;i<e.length;i++) {
		System.out.println("Employee : "+(i+1)+ " Name: "+e[i].getName()+ " Age: "+e[i].getAge()+e[i].getPlace());

	}
		System.out.println();
		
		/* Sorting array on the basis of employee age by passing AgeComparator */
		System.out.println("After Sorting Employee on basis of age");
		
		Arrays.sort(e, new AgeComparator());
		for(int i=0;i<e.length;i++) {
			System.out.println((i+1)+" "+e[i].getName()+" "+e[i].getAge());
			
		}
		 
		System.out.println();
		
		/* Sorting array on the basis of employee name by passing NameComparator */
		System.out.println("After Sorting Employee on basis of Name");
		Arrays.sort(e, new NameComparator());
		for(int i=0;i<e.length;i++) {
			System.out.println((i+1)+" "+e[i].getName()+" "+e[i].getAge());
		}
		
		/* Sorting array on the basis of employee Place by passing PlaceComparator */
		System.out.println();
		System.out.println("After Sorting Employee on basis of Place");
		Arrays.sort(e, new PlaceComparator());
		for(int i=0;i<e.length;i++) {
			System.out.println((i+1)+" "+e[i].getName()+" "+e[i].getAge()+" "+e[i].getPlace());
		}
	

}
}
