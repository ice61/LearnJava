package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test4 {

	public static void main(String[] args) throws IOException {
		for(int i=0;i<=10;++i)
			demo1();
	}
	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String num = br.readLine();
		br.close();
		int times = Integer.parseInt(num);
		System.out.println("您还有"+times--+"次使用机会");
		FileWriter fw = new FileWriter("config.txt");
		fw.write(times+"");
		fw.close();
	}
}
