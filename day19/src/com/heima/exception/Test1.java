package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		while(true) {
			String line = sc.nextLine();
			try {
				int i = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(i));
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("����������������������һ������");					
				}catch(Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("���������ΪС��������������һ������");						
					}catch(Exception e2) {
						System.out.println("�����Ϊ�Ƿ��ַ�������������һ������");
					}
				}
			}
		}
	}

}
