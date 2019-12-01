package experiment;

import java.util.Scanner;

public class Password {
	private String password = "123456";
	private String name = "haha";
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = sc.nextLine();
		System.out.println("请输入密码");
		String password = sc.nextLine();
		if(password.equals(this.password) && name.equals(this.name)) {
			System.out.println("登陆成功！");
		}else {
			throw new RuntimeException("用户名或密码错误！");
		}
	}
}
