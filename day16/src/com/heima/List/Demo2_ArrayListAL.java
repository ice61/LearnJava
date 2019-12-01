package com.heima.List;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo2_ArrayListAL {

	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		ArrayList<Person> a1 = new ArrayList<>();
		a1.add(new Person("张三",23));
		a1.add(new Person("李四",24));
		
		ArrayList<Person> a2 = new ArrayList<>();
		a2.add(new Person("阿赐",20));
		a2.add(new Person("吴尚",20));
		
		list.add(a1);list.add(a2);
		for(ArrayList<Person> a:list) {
			for(Person p:a) {
				System.out.println(p.getName()+"..."+p.getAge());
			}
		}
	}

}
