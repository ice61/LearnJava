package com.heima.threadmethod;

public class Demo2_Sleep {

	public static void main(String[] args) throws InterruptedException {
		for(int i=10;i>=0;--i) {
			System.out.println("µ¹¼ÆÊ±µÚ"+i+"Ãë");
			Thread.sleep(1000);
		}
	}
}
