package com.generic;


class Data_generic<T>{      // T is template of class Data_generic Tused as any datatype
	private T obj;

public Data_generic(T obj) {
	this.obj = obj;
}

/**
 * @return the obj
 */
public T getObj() {
	return obj;
}

@Override
public String toString() {
	return "Data_generic [obj=" + obj + "]";
}



	
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		Data_generic<String> obj_o =new Data_generic<String>("Rupesh");
		String out= obj_o.getObj();
		System.out.println(out);

	}

}
