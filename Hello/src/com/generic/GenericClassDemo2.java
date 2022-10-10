package com.generic;

import java.util.LinkedList;
import java.util.List;

class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		
		this.myVariable = myVariable;
	}

	/**
	 * @return the myVariable
	 */
	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
	
}
public class GenericClassDemo2 {

	public static void main(String[] args) {
		List<Data<Object>> obj=new LinkedList<>();
		obj.add(new Data<Object>("Hello 11"));
		obj.add(new Data<Object>(17));
		obj.add(new Data<Object>(61));
		obj.add(new Data<Object>(191));
		obj.add(new Data<Object>(95));
		obj.add(new Data<Object>(121.988));

		System.out.println(obj);
		
		
	}

}
