package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test3 {

	//��һ�������д洢�������ظ����ַ���������һ�����������������ֵ�˳�򣩣����Ҳ���ȥ���ظ�
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("aaa");
		al.add("ccc");
		al.add("ffffffff");
		al.add("heima");
		al.add("itcast");
		al.add("ccc");
		sort(al);
		System.out.println(al);
	}
	
	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);
				return num==0? 1:num;
			}
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
}
