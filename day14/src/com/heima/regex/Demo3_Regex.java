package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3_Regex {

	public static void main(String[] args) {
		String s = "�ҵ��ֻ�������18988888888�������ù�18987654321�����ù�18812345678";
		String regex = "[1][3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}

}
