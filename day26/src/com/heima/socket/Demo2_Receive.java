package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo2_Receive {

	public static void main(String[] args) throws Exception {
		/*DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		while(true) {
			socket.receive(packet);
			byte[] arr = packet.getData();
			int len = packet.getLength();
			System.out.println(new String(arr,0,len));*/
		DatagramSocket socket = new DatagramSocket(5970);
		DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
		System.out.println("�����ɹ�");
		while(true) {
			System.out.println("����ѭ��");
			socket.receive(packet);
			System.out.println("���ճɹ�");
			byte[] arr = packet.getData();
			int len = packet.getLength();
			System.out.println(new String(arr,0,len));			
		}
	}
}
