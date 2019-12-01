package com.heima.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo3_MoreThread {

	public static void main(String[] args) throws InterruptedException {
		new Receive().start();
		Thread.sleep(1000);
		new Send().start();
		
	}
}
class Receive extends Thread {

	@Override
	public void run() {
		System.out.println("���Խ���");
		try {
			DatagramSocket socket = new DatagramSocket(7000);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			while(true) {
				socket.receive(packet);
				System.out.println("���ճɹ�");
				byte[] arr = packet.getData();
				int len = arr.length;
				System.out.println(new String(arr,0,len));
			}
		}  catch (IOException e) {	
			e.printStackTrace();
		}
	}
}
class Send extends Thread {

	@Override
	public void run() {
		System.out.println("���Է���");
		try {
			Scanner sc = new Scanner(System.in);
			DatagramSocket socket = new DatagramSocket();
			while(true) {
				String line = sc.nextLine();
				if("quit".equals(line))
					break;
				DatagramPacket packet =
						new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("127.0.0.1"),7000);
				socket.send(packet);
				System.out.println("���ͳɹ�");
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}