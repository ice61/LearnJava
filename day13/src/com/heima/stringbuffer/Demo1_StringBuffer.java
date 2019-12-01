package com.heima.stringbuffer;

public class Demo1_StringBuffer {

	public static void main(String[] args) {
		//demo1();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");
		System.out.println(sb);
	}

	private static void demo1() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb4);
	}

}
