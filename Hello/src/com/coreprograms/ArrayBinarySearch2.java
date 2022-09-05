package com.coreprograms;

import java.util.Arrays;

public class ArrayBinarySearch2 {

	public static void main(String[] args)
	{
      int[] arr= {56,24,90,75,1,19,50,89,100};
		
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++)
     {
      System.out.println(arr[i]);
     }
      int find=89;
      
      System.out.println(Arrays.binarySearch(arr, 0, 5,find));
      
      
	}

}
