package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt"); //����������
		int x = fis.read();									 //��Ӳ���϶�ȡһ���ֽ�
		System.out.println(x);
		fis.close();										 //�����ͷ���Դ
	}

}
