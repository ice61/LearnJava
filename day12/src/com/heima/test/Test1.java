package com.heima.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		String key = "admin";
		for(int i=1;i<=3;++i) {
			System.out.println("�������û���");
			String s1 = sc.nextLine();
			System.out.println("����������");
			String s2 = sc.nextLine();
			if(s1.equals(name)&&s2.equals(key)) {
				System.out.println("��½�ɹ�");
				break;
			}else {
				System.out.println("��������û�������");
				System.out.println("����"+ (3-i) +"�λ���");
			}
		}
	}
}
