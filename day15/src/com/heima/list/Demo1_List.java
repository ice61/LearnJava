package com.heima.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo1_List {

	public static void main(String[] args) {
		List c = new ArrayList();
		c.add("world");
		c.add("ahvbv");
		c.add("wer");
		c.add("ewr");
		c.add("sdfew");
		System.out.println(c);
		ListIterator lit = c.listIterator();
		while(lit.hasNext()) {
			String str = (String)lit.next();
			if(str.equals("world"))
				lit.add("javaee");
		}
	
		System.out.println(c);
	}

}
