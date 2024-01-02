package com.java.backend;

public class MethodExample {

	//instance method
	public void nonStatic(){
		System.out.println("non static");
	}

	//static method
	public static void staticMethod(){
		System.out.println("static");
	}

	public static void main(String[] args) {
		
		MethodExample exp=new MethodExample();  // Heap memory 
		exp.nonStatic();
		MethodExample.staticMethod();
	}

}
