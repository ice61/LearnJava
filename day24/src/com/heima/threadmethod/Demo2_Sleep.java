package com.heima.threadmethod;

public class Demo2_Sleep {

	public static void main(String[] args) throws InterruptedException {
		for(int i=10;i>=0;--i) {
			System.out.println("����ʱ��"+i+"��");
			Thread.sleep(1000);
		}
	}
}
