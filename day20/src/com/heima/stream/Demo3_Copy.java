package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("Í¯¶þ´ç²Ê.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int b;
		while((b = fis.read())!=-1)
			fos.write(b);
		fis.close();
		fos.close();
		System.out.println(System.currentTimeMillis()-start);
	}
}
