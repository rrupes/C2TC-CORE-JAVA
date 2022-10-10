package com.coreprograms;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		ReentrantLock l=new ReentrantLock();
		l.lock();
		System.out.println(l.isLocked());
		
		l.unlock();
		System.out.println(l.isLocked());

	}

}
