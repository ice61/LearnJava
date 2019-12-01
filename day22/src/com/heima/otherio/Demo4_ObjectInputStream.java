package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.heima.bean.Person;

public class Demo4_ObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person)ois.readObject(); 
		Person p2 = (Person)ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		ois.close();
	}
}
