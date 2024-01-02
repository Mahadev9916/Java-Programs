package com.java.backend;

class Animal{
	void eat() {
		System.out.println("Animal eating....");
	}
}

class cat extends Animal{
	void bark() {
		System.out.println("cat barking....");
	}
}


public class Inheritance{
	
	public static void main(String[] args) {
		cat c=new cat();
		c.bark();
		c.eat();
	}
}
