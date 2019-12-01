package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o2-o1;
				return num==0?1:num;
			}
		});
		String str = new String();
		while(true) {
			str = sc.nextLine();
			if("quit".equals(str))
				break;
			else {
				ts.add(Integer.parseInt(str));
			}
		}
		for (Integer i : ts) {
			System.out.println(i);
		}
	}

}
