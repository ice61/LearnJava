package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		File dir = findFile();
		findAll(dir);
	}
	
	public static File findFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件夹路径名");
		File dir;
		while(true) {
			String line = sc.nextLine();
			dir = new File(line);
			if(!dir.exists()) {
				System.out.println("路径名不存在，请重新输入：");
			}else if(dir.exists()&&dir.isFile()) {
				System.out.println("您输入的为文件路径名，请输入文件夹路径名：");
			}else {
				return dir;
			}
		}
	}
	public static void findAll(File file) {
		File[] subFiles = file.listFiles();
		for (File subFile : subFiles) {
			if(subFile.isFile()&&subFile.getName().endsWith(".java"))
				System.out.println(subFile.getName());
			else if(subFile.isDirectory()) {
				findAll(subFile);
			}
		}
	}
}
