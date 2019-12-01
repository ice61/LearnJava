package com.heima.List;

import java.util.ArrayList;
import java.util.Iterator;
	//去除集合中的重复值
public class Demo1_ArrayList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("skfdj");
		a.add("adfcv");
		a.add("45874");
		a.add("45874");
		a.add("skfdj");
		ArrayList b = getSingle(a); 
		System.out.println(b);
	}
	public static ArrayList getSingle(ArrayList list) {
		ArrayList al = new ArrayList();
		Iterator i = list.iterator();
		while(i.hasNext()) {
			String s = (String)i.next();
			if(!al.contains(s))
				al.add(s);
		}
		return al;
	}
}
