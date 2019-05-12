package com.tugas.main;

public class RunnableT implements Runnable{

	@Override
	public void run() {
		System.out.println("Tread :  "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
