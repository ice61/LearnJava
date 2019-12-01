package com.heima.regex;

public class Demo1_Regex {

	public static void main(String[] args) {
		String regex ="[1-9]\\d{4,14}";
		System.out.println("2553868".matches(regex));
		System.out.println("0154544".matches(regex));
		System.out.println("12sdfw0".matches(regex));
	}

}
