package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1_Reflect {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		Class clazz = Class.forName(br.readLine());
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person)c.newInstance("ÕÅÈý",23);
		System.out.println(p);
		Field f = clazz.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p, 24);
		System.out.println(p);
		Method m = clazz.getDeclaredMethod("eat",int.class);
		m.setAccessible(true);
		m.invoke(p,100);
	    
		Method[] f2 = clazz.getDeclaredMethods();
		for (Method method : f2) {
			System.out.println(method);
		}
	}

}
