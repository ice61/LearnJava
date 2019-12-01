package com.heima.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2_ByteArrayOutputStream {
	//ÄÚ´æÊä³öÁ÷
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int b;
		while((b = fis.read())!=-1)
			baos.write(b);
		byte[] arr = baos.toByteArray();
		System.out.println(new String(arr));
		fis.close();
	}

}
