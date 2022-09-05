package com.coreprograms;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of youe array");    // creating
    int size =sc.nextInt();
    
  try { 
	  int[] arr=new int[10];    // specify size of array
    System.out.println("Enter the element in array");
    
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();	
    }
  
  
   
    for(int i=0;i<size;i++) {
    System.out.println(arr[i]);  // printing array
	}
    

}
  finally{
	  System.out.println("you cannot enter more than 10 element");
	  
  }
}
}
