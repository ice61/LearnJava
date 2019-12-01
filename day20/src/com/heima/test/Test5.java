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
		System.out.println("�������ļ���·����");
		File dir;
		while(true) {
			String line = sc.nextLine();
			dir = new File(line);
			if(!dir.exists()) {
				System.out.println("·���������ڣ����������룺");
			}else if(dir.exists()&&dir.isFile()) {
				System.out.println("�������Ϊ�ļ�·�������������ļ���·������");
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
