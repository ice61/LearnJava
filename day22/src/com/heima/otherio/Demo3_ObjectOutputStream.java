package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.heima.bean.Person;

public class Demo3_ObjectOutputStream {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person("张三",23);
		Person p2 = new Person("李四",24);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
	}	

}
