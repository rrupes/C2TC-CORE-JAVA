package com.generic;


//Simple Program to demonstrate 2 parameter inside generic class
class Dataa<K,V>{
	private K key;
	private V value;
	
	public Dataa(K key, V value) {
		
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	// generic method............
    public <E,N> void disp(E element,N number) {
    	 // Here elemnt and number can be any data type No restrictions just for understanding
		System.out.println("Element "+element+ " Number "+number);   
	}
	
	
}
public class GenericClassAndMethodsExample {

	public static void main(String[] args) {
		System.out.println("Output of generic Class ");
		Dataa<Integer,String> obj=new Dataa<Integer,String>(1,"Rupesh");
		System.out.println("Key :"+obj.getKey() +" Value :"+obj.getValue());
		System.out.println();
		System.out.println("Output of generic method ");
		obj.disp("Rupesh", 101);
		

	}

}
