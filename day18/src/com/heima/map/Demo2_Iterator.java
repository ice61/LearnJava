package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("张三", 23);
		m.put("王五", 25);
		m.put("赵六", 26);
		
		Set<Map.Entry<String,Integer>> entrySet = m.entrySet();
		Iterator<Map.Entry<String,Integer>> i = entrySet.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> en = i.next();
			System.out.println(en.getKey()+"..."+en.getValue());
		}
	}

}
