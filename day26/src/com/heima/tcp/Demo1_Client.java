package com.heima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {

	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("127.0.0.1",12345);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr,0,len));
		os.write("�ɹ��յ�".getBytes());
		socket.close();
	}

}
