package com.java.backend.oops;

public class IntToString {

	public static void main(String[] args) {
		int a=10;
//		String b=String.valueOf(a);
		String b=String.format("%d", a);
//		String b = Integer.toString(a);
		System.out.println(b+10);
		System.out.println(a+10);
		
		
//		%d
//		%n
	}
}
