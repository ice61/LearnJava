package com.heima.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_OutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		fos.write(97);
		fos.write(98);
		fos.write(99);
		fos.close();
	}

}
