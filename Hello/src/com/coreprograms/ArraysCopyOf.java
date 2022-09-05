package com.coreprograms;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {

		int[] arr= {5,76,89,14,57,45,99};
		Arrays.sort(arr);
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 20)));
		
	
		
	}
}


