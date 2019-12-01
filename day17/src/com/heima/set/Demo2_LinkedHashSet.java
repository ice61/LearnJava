package com.heima.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("a");
		lhs.add("c");
		System.out.println(lhs);
		
	}

}
