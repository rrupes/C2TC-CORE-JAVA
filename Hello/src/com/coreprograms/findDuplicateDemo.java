package com.coreprograms;

public class findDuplicateDemo {

	public static void main(String[] args) {

		String s="KUSHAWAHA";
		char[] c=s.toCharArray();
		// boolean by default value is false
		boolean []b=new boolean[c.length];  
		
		for(int i=0;i<c.length;i++)
		{
			if(b[i]==false) 
			{
				int count=1;
				for(int j=i+1;j<b.length;j++) 
				{
					if(c[i]==c[j]) // comapring both loop element
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				{
					System.out.println(c[i]+" " +count);
				}
			}
		}
	}

}
