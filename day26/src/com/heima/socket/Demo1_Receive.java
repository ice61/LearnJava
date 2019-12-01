package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(5959);
		DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
		socket.receive(packet);
		socket.close();
		byte[] arr = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr,0,len));
	}

}
