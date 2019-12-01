package com.heima.string;

import java.util.Scanner;

public class Demo3_StringMethod {

	public static void main(String[] args) {
		String s1 = "ABCagd1595£¡@#";
		int xiao=0,da=0,other=0,num=0;
		for(int i=0;i<s1.length();++i) {
			char c = s1.charAt(i);
			if(c>='a'&&c<='z')
				++xiao;
			else if(c>='A'&&c<='Z')
				++da;
			else if(c>='0'&&c<='9')
				num++;
			else
				++other;
		}
		System.out.println(xiao);
		System.out.println(da);
		System.out.println(num);
		System.out.println(other);
		
	}
}
