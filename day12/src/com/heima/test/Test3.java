package com.heima.test;

public class Test3 {
	public static void main(String args[]) {
		String s1 = "abcabcdgdabccabcd";
		String s2 = "abc";
		int k =0,num=0;
		while(true) {
			if(s1.indexOf(s2, k)!=-1) {
				++num;
				k=s1.indexOf(s2,k)+s2.length();
			}else {
				break;
			}
		}
		System.out.println("¹²ÓÐ"+num+"¸ö");
	}
}