package com.heima.threadmethod;

public class Demo1_Name {

	public static void main(String[] args) {
		new Thread("°¢´Í") {
			public void run() {
				System.out.println(this.getName()+"aaa");
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println(this.getName()+"bbb");
			}
		}.start();
	}
	

}
