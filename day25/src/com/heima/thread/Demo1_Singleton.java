package com.heima.thread;

public class Demo1_Singleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getS();
	}

}
class Singleton {
	private Singleton() {}
	private static Singleton s = new Singleton();
	public static Singleton getS() {
		return s;
	}
}