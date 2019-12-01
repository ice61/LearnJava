package com.heima.object;

import com.heima.bean.Student;

public class Demo2_Equals {

	public static void main(String[] args) {
		Student s1 = new Student("张三",23);
		Student s2 = new Student("张三",23);
		boolean b = s1.equals(s2);
		System.out.println(b);
	}

}
