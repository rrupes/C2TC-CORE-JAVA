package com.comparator;

import java.util.Comparator;

public class PlaceComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		String emp1Place=((Employee)emp1).getPlace();
		String emp2Place=((Employee)emp2).getPlace();
		
		
		
		return emp1Place.compareTo(emp2Place);
	}

}
