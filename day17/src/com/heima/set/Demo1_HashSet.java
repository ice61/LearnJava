package com.heima.set;

import java.util.HashSet;

import com.heima.bean.Person;

public class Demo1_HashSet {

	public static void main(String[] args) {
		//demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("张三",23));
		System.out.println(hs.size());
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		System.out.println(b1+"..."+b2);
	}

}
