package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3_Regex {

	public static void main(String[] args) {
		String s = "我的手机号码是18988888888，曾经用过18987654321，还用过18812345678";
		String regex = "[1][3578]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find())
			System.out.println(m.group());
	}

}
