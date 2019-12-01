package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("Í¯¶þ´ç²Ê.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		byte[] b = new byte[1024*8];
		int len;
		while((len = fis.read(b))!=-1)
			fos.write(b,0,len);
		fis.close();
		fos.close();
		System.out.println(System.currentTimeMillis()-start);
	}

}
