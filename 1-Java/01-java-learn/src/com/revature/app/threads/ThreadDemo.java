package com.revature.app.threads;

public class ThreadDemo extends Thread{
	public void run() {
		System.out.println("Thread" + getName() + "is running");
	}

}
