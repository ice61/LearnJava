package com.hehe.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BeanFactory {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("bean"); 
	
	private static Map<String, Object> beans = new HashMap<>();
	static {
		Enumeration<String> keys = bundle.getKeys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = bundle.getString(key);
			try {
				Object bean = Class.forName(value).newInstance();
				beans.put(key, bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Object getBean(String key) {
		return beans.get(key);
		
	}
	
}
