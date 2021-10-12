package com.revature.app.threads;

public class Main {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		System.out.println("Main (" + mainThread.getName() + ") Thread...");
		
		ThreadDemoRunnable runnable = new ThreadDemoRunnable();
		Thread threadRunnable = new Thread(runnable);
		threadRunnable.start();
		
		System.out.println("Main (" + mainThread.getName() + ") is running");

	}

}
