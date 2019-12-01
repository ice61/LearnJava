package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

public class Demo1_Collection {

	public static void main(String[] args) {
		//demo1();
		
	}

	private static void demo1() {
		Collection c = new ArrayList();
		boolean b1=c.add("abc");
		boolean b2 = c.add(true);
		boolean b3 = c.add("abc");
		boolean b4 = c.add(new Student("уехЩ",23));
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(c);
	}

}
