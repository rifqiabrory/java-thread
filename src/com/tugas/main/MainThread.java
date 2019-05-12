package com.tugas.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MainThread {

	public static void main(String[] args) {
		
		ThreadImpl threadImpl =new ThreadImpl();
		Thread thread = new Thread(threadImpl,"MyThread");//par1 = instance from class runnable,  par2 = String ,thread name
		System.out.println("Main : "+Thread.currentThread().getName());
		thread.start();
		
//		for(int i=0;i<10;i++) {
//			ThreadImpl threadImpl =new ThreadImpl();
//			Thread thread = new Thread(threadImpl,"MyThread");//par1 = instance from class runnable,  par2 = String ,thread name
//			System.out.println("Main :  "+Thread.currentThread().getName());
//			thread.start();
//		}

//		int num = 2;
//		ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(num);
//		for(int i=0;i<10;i++) {
//			ThreadImpl threadImpl =new ThreadImpl();
//			Thread thread = new Thread(threadImpl,"MyThread");//par1 = instance from class runnable,  par2 = String ,thread name
//			System.out.println("Thread Name :  "+Thread.currentThread().getName());
//			thread.start();
//			service.execute(thread);
//		}
//		System.out.println("Thread Name 1 :  "+Thread.currentThread().getName());
//		
	}

}
