package com.heima.threadmethod;

public class Test_Ticket {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("һ�Ŵ���");
		Ticket t2 = new Ticket("���Ŵ���");
		Ticket t3 = new Ticket("���Ŵ���");
		Ticket t4 = new Ticket("�ĺŴ���");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Ticket extends Thread {
	private static int ticket = 100;
	
	public Ticket(String name) {
		super(name);
		
	}
	public Ticket() {
		super();
	}
	public void run() {
		while(true) {
			synchronized (Ticket.class) {
				if(ticket<=0)
					break;
				System.out.println(getName() + "...���ǵ�"+ticket--+"��Ʊ");				
			}
		}
	}
}