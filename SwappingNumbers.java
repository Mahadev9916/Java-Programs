package com.java.backend;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		
		System.out.println("before swapping value of a"+a+" and b : "+b);
		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
		
		
		a=a+b; //a=15
		b=a-b; //b=5
		a=a-b; //a=10
		
		System.out.println("after swapping value of a"+a+" and b : "+b);
	}
}
