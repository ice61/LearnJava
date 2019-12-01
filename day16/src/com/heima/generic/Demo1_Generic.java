package com.heima.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.heima.bean.Person;

public class Demo1_Generic {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		Iterator<Person> i = list.iterator();
		while(i.hasNext()) {
			Person s = i.next();
			System.out.println("������"+s.getName()+"���䣺"+s.getAge());
			i.remove(); 
		}
	}

}
