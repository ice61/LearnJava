package com.heima.threadmethod;

public class Demo4_Join {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<10;++i)
					System.out.println(this.getName() + "..." + "aaa");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<10;++i) {
					if(i==2) {
						try {
							t1.join();
						} catch (InterruptedException e) {		
							e.printStackTrace();
						}						
					}
					System.out.println(this.getName()+ "..." + "bbb");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
