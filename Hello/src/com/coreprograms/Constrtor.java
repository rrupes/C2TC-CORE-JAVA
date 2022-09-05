package com.coreprograms;

public class Constrtor {
	String name,place;
	int id;
	/**
	 * @param name
	 * @param place
	 * @param id
	 */
	public Constrtor(String name, String place, int id) {
		super();
		this.name = name;
		this.place = place;
		this.id = id;
		
		
	}
	public Constrtor() {
		super();
		
	}
	

	@Override
	public String toString() {
		return "Constrtor [name=" + name + ", place=" + place + ", id=" + id + "]";
	}


	public static void main(String[] args) {
		
		Constrtor c1=(new Constrtor("rupesh", "mumbai", 1));
		Constrtor c2=(new Constrtor("rupesh", "surat", 2));
		Constrtor c3=(new Constrtor("rupesh", "delhi", 3));
		
		
		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c3);

	}
	
	

}
