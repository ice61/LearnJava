package com.heima.¼òµ¥¹¤³§;

public class AnimalFactory {
	public static Animal createAnimal(String name) {
		if("dog".equals(name))
			return new Dog();
		else if("cat".equals(name))
			return new Cat();
		else
			return null;
	}
	
}
