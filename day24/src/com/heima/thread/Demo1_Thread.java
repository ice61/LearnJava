package com.heima.thread;

public class Demo1_Thread {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		my.start();
		for(int i=0;i<1000;++i)
			System.out.println("bbb");
	}

}
class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<1000;++i)
			System.out.println("aaaaaaaaa");
	}
	
}
