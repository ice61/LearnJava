 package com.heima.object;

import com.heima.bean.Student;

public class Demo1_HashCode {

	public static void main(String[] args) {
		Student s = new Student("уехЩ",23);
		String str = s.toString();
		System.out.println(str);
	} 

}
