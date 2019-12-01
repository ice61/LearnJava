package com.heima.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1_Iterator {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("张三", 23);
		m.put("王五", 25);
		m.put("赵六", 26);
		
		Set<String> key = m.keySet();
		Iterator<String> i = key.iterator();
		while(i.hasNext()) {
			String k = i.next();
			System.out.println(k+"..."+m.get(k));
		}
	}
}
