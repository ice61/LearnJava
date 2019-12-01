package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num==0?1:num;
			}
		});
		for(int i=0;i<b.length;++i)
			ts.add(b[i]);
		ArrayList<Character> l = new ArrayList<>();
		l.addAll(ts);
		System.out.println(l);
	}

}
