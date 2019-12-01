package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//在控制台录入文件的路径，将文件拷贝到当前项目下
public class Test2 {

	public static void main(String[] args) throws IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
		System.out.println("拷贝成功！");
	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件的路径：");
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists())
				System.out.println("您录入的文件路径不存在，请重新录入");
			else if(file.isDirectory())
				System.out.println("你输入的是文件夹路径，请重新录入");
			else
				return file;
		}
	}
}
