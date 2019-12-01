package com.heima.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String s1 = sc.nextLine();
		s1 = s1.toUpperCase();
		char []arr = s1.toCharArray();
		boolean flag =false;
		for(int i=0;i<arr.length;++i) {
			if(i==0)
				arr[i]+=32;
			if(arr[i]==' ')
				flag=true;
			if(flag==true&&arr[i]!=' ') {
				flag=false;
				arr[i]+=32;
			}
		}
		s1 = String.valueOf(arr);
		System.out.println(s1);
	}
}
