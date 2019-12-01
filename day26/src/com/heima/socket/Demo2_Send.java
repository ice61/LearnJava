package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo2_Send {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		while(true) {
			String str = sc.nextLine();
			if("quit".equals(str))
				break;
			DatagramPacket packet = 
					new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"), 5970);
			socket.send(packet);
			System.out.println("·¢ËÍ³É¹¦");
		}
		socket.close();
	}

}
