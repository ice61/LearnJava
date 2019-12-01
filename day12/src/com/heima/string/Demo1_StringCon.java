package com.heima.string;

import java.util.Scanner;

public class Demo1_StringCon {

	public static void main(String[] args) {
		/*byte [] arr1 = {97,98,99};
		String s1 = new String(arr1);
		System.out.println(s1);
		
		byte [] arr2 = {97,98,99,100};
		String s2 = new String(arr2,1,2);
		System.out.println(s2);
		
		char [] arr3 = {'a','b','c','1'};
		String s3 = new String(arr3);
		System.out.println(s3);
		
		char [] arr4 = {'a','b','c','5','8'};
		String s4 = new String(arr4,1,3);
		System.out.println(s4);*/
		
	/*	String s1 = "ab";
		String s2 = "abc";
		String s3 =s1+"c";
		System.out.println(s3==s2);			
		System.out.println(s3.equals(s2));	*/
		Scanner sc = new Scanner(System.in);
		String s2 = "abcd";
		String s1 = sc.nextLine();
		System.out.println(s1==s2);
	}

}
