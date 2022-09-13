package com.coreprograms;

public class ThreadsDemo {
	//thread 1

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("I am Main Thread");
		}
	}
	
	}

class MyThread extends Thread{
	//Thread 2
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("I am MyThread");
	}
	}
}