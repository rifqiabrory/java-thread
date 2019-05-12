package com.tugas.main;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MainT {

	public static void main(String[] args) throws InterruptedException {
		int num = 2;
		ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(num);
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		service.submit(new RunnableT());
		
		while (!service.getQueue().isEmpty()) {
			//RunnableT runnable =new RunnableT();
			System.out.println("Thread Queue :  "+service.getQueue().size());
			System.out.println("Thread Opening :  "+service.getActiveCount());
			Thread.sleep(3000);
		}
		System.out.println("Thread Name 1 :  "+Thread.currentThread().getName());
	}

}
