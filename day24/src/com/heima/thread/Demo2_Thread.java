package com.heima.thread;

public class Demo2_Thread {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
	}
}
class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<1000;++i) {
			System.out.println("aaaa");
		}
	}
}
