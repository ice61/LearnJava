package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for(int i=0;i<b.length;++i)
			hs.add(b[i]);
		for (Character character : hs) {
			System.out.println(character);
		}
	}
}
