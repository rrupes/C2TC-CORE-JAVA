


// The below given comparator compares employees on the basis of their age

package com.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int emp1Age=((Employee)emp1).getAge();
		int emp2Age=((Employee)emp2).getAge();
		
		if(emp1Age > emp2Age)
			return 1;
		
		else if(emp1Age < emp2Age)
			return -1;
		
		return 0;
		
	}
	

}
