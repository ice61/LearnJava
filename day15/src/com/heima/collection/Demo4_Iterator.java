package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo4_Iterator {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		Iterator it = c.iterator();  //»ñÈ¡µü´úÆ÷
		while(it.hasNext())
			System.out.println(it.next());
	}

}
