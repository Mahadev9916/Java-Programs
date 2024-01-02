package com.java.backend.oops;

public class MethodOverloading {

	public void sum() {
		System.out.println("fygg");
	}
	
	public void sum(int a,long b) {
		System.out.println(a+b);
	}
	
	
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.sum(1,2);
		mo.sum(1,2,3);
	}
	
}
