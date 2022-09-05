package com.coreprograms;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) 
	{
      int[] arr= {9,18,35,49,67,90,85,22};    // element in arrays
      
          Arrays.sort(arr);   // sorting the element in arrays
          for(int i=0;i<arr.length;i++)
          {
          System.out.println(arr[i]+" ");
    	 
          }
          int find=49;   // find index of 49
      
      System.out.println("Finding the element at index:"+Arrays.binarySearch(arr, find));
      
      
      
	}

}
