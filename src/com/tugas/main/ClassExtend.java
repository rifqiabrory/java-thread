package com.tugas.main;

public class ClassExtend extends Thread{
	
	public ClassExtend(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Name Thread : "+Thread.currentThread().getName());
	}
}
