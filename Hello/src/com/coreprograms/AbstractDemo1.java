package com.coreprograms;


 abstract class Vehicle{
	public abstract int getNoOfVehicles();
	
}
class Bus extends Vehicle{

	@Override
	public int getNoOfVehicles() {
		// TODO Auto-generated method stub
		return 8;
	}
}
	class Auto extends Vehicle{

		@Override
		public int getNoOfVehicles() {
			// TODO Auto-generated method stub
			return 3;
		}
		
	}




public class AbstractDemo1 {
	public static void main(String[] args) {
		
		Bus b=new Bus();
		System.out.println(b.getNoOfVehicles());
		
		Auto a=new Auto();
		System.out.println(a.getNoOfVehicles());
		}
	

	}
