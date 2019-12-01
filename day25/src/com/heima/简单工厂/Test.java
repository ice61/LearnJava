package com.heima.¼òµ¥¹¤³§;

public class Test {

	public static void main(String[] args) {
		Dog d = (Dog)AnimalFactory.createAnimal("dog");
		d.eat();
	}

}
