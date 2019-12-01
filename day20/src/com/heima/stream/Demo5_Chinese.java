package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5_Chinese {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("yyy.txt");
		byte[] arr = new byte[3];
		int len;
		while((len=fis.read(arr))!=-1) {
			System.out.println(new String(arr,0,len));
		}
		fis.close();
	}

}
