package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3_CollectionAll {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		Collection c2= new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		
		c1.addAll(c2);
		System.out.println(c1);
	}

}
