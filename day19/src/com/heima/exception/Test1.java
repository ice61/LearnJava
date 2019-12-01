package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		while(true) {
			String line = sc.nextLine();
			try {
				int i = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(i));
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("输入整数过大，请重新输入一个整数");					
				}catch(Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("输入的数字为小数，请重新输入一个整数");						
					}catch(Exception e2) {
						System.out.println("输入的为非法字符，请重新输入一个整数");
					}
				}
			}
		}
	}

}
