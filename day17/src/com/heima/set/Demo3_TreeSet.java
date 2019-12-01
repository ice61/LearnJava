package com.heima.set;

import java.util.TreeSet;

public class Demo3_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(2);
		System.out.println(ts);
	}

}
