package experiment;

import java.util.Scanner;

public class Password {
	private String password = "123456";
	private String name = "haha";
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���");
		String name = sc.nextLine();
		System.out.println("����������");
		String password = sc.nextLine();
		if(password.equals(this.password) && name.equals(this.name)) {
			System.out.println("��½�ɹ���");
		}else {
			throw new RuntimeException("�û������������");
		}
	}
}
