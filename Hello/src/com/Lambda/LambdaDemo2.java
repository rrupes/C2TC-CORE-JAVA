package com.Lambda;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1");
				
			}
			
		});
				
t.start();
	}

}
