package com.heima.threadmethod;

public class Demo3_Daemon {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<2;++i) 
					System.out.println(this.getName()+"...."+"aaaa");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<30;++i) 
					System.out.println(this.getName()+"...."+"bb");
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}

}
