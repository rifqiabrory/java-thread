package com.tugas.main;

public class MainExtend {

	public static void main(String[] args) {
		
		ClassExtend threadImpl = new ClassExtend("MyThread");
		Thread thread = new Thread(threadImpl, "Baru");
		System.out.println("Main : "+Thread.currentThread().getName());
		thread.start();
	}

}
