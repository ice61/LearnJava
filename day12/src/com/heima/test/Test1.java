package com.heima.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		String key = "admin";
		for(int i=1;i<=3;++i) {
			System.out.println("请输入用户名");
			String s1 = sc.nextLine();
			System.out.println("请输入密码");
			String s2 = sc.nextLine();
			if(s1.equals(name)&&s2.equals(key)) {
				System.out.println("登陆成功");
				break;
			}else {
				System.out.println("密码或者用户名错误");
				System.out.println("还有"+ (3-i) +"次机会");
			}
		}
	}
}
