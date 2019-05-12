package com.tugas.main;

public class ThreadImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadImpl :"+Thread.currentThread().getName());
	}
	
}
