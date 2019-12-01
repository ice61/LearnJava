package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

public class Demo2_Collection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add(new Student("уехЩ",23));
		Object[] arr = c.toArray();
		for(int i=0;i<arr.length;++i)
			System.out.println(arr[i]);
	}

}
