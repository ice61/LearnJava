package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo1_Send {

	public static void main(String[] args) throws IOException {
		String str = "what are you?";
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = 
				new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"), 5959);
		socket.send(packet);
		socket.close();
	}

}
