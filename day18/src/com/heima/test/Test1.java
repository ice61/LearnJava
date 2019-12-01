package com.heima.test;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		TreeMap<Character, Integer> tm = new TreeMap<>();
		for(char c:arr) {
			if(tm.containsKey(c)) {
				int num=tm.get(c)+1;
				tm.put(c, num);
			}else {
				tm.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> s = tm.entrySet();
		for (Map.Entry<Character, Integer> e : s) {
			System.out.println("字母"+e.getKey()+"出现了"+e.getValue()+"次");
		}
	}

}
