package com.coreprograms;

import java.util.Scanner;

public class PerfectNumber {         // 6=3+2+1 ----> PerfectNumber

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        
        int number=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<number;i++)
        {
        	if(number%i==0)    // if remainder=0
        	{
        		sum=sum+i;    // adding i 
        		
        	}        	
        	       }
        if(number==sum)
        {
        System.out.println(number +"is perfect number");
        
		
	}
        else
        {
				  System.out.println(number +"is not perfect number");
	}

}
}
