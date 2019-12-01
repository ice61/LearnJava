package com.heima.exception;

public class Demo1_Exception {

	public static void main(String[] args) throws AgeOutOfBoundsException {
		Person p = new Person();
		p.setAge(-10);
		System.out.println(p.getAge());
	}
}
class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeOutOfBoundsException {
		if(0<=age&&age<=150) {			
			this.age = age;
		}else {
			throw new AgeOutOfBoundsException("ÄêÁä·Ç·¨"); 
		}
	}
}