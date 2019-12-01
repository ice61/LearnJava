package com.heima.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



public class Demo2_Timer {

	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		t.schedule(new MyTimerTask(),new Date(118,6,24,17,43,30));
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}
class MyTimerTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("Æð´²±³µ¥´Ê");
	}
}