package com.coreprograms;


interface Animal  //interface 1
{   
	public void animalSound();  // Interface Method bby default abstract and public 
	public int legs();
}
interface Color    //interface 2
{
	public void color();   // Interface Method bby default abstract and public 
}
 class Pig implements Animal,Color       // Achiveing multiple inheritance through interface
 {

	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
		
	}
	
	@Override
	public int legs() {
		return 4;
	}

	@Override
	public void color() {
		 System.out.println("pig color is pink");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Pig p=new Pig();
		p.animalSound();
		p.color();
		System.out.println(p.legs());
	}

}
