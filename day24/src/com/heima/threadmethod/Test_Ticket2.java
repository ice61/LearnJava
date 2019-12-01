package com.heima.threadmethod;

public class Test_Ticket2 {

	public static void main(String[] args) {
		Tickets t = new Tickets();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}

class Tickets implements Runnable {
	private int num = 100;
	public void run() {
		while(true) {
			synchronized (this) {
				if(num<=0) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+"这是第"+num--+"张票");				
			}
		}
	}
	
}