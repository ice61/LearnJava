package com.heima.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2_ListIterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next());
		while(lit.hasPrevious())
			System.out.println(lit.previous());
	}

}
