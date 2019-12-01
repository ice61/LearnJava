package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt"); //创建流对象
		int x = fis.read();									 //从硬盘上读取一个字节
		System.out.println(x);
		fis.close();										 //关流释放资源
	}

}
