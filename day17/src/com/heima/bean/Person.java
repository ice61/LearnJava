package com.heima.bean;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaa");
		ts.add("ertret");
		ts.add("adfda");
		ts.add("zz");
		System.out.println(ts);
	}
}
class CompareByLen implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		int num = s1.length()-s2.length();
		return num==0 ? s1.compareTo(s2):num;
	}
	
}
