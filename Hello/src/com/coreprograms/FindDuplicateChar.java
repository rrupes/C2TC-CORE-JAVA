package com.coreprograms;

public class FindDuplicateChar {
	public static void main(String[] args) {
	String s="Maharashtra";
	char [] c =s.toCharArray();
	boolean [] b= new boolean[c.length];   // boolean by default value is false
	for(int i=0;i<c.length;i++) {
		if(b[i]==false) {
			int count =1;
			for(int j=i+1;j<b.length;j++) {
				if(c[i]==c[j]) {
					count++;
					b[j]=true;
				}
			}
			if(count>1) {                              //this condition for repeating charachter
			System.out.println(c[i]+" "+count);
		}
	}

}
}
}
