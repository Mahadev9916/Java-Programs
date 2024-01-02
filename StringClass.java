package com.java.backend.oops;

public class StringClass {

	
	public static void main(String[] args) {
//		char ch[]= {'s','a','t','y'};
		String str="aravind,puttaswamy,kartik,mahadev";
		
//		System.out.println(str);
//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.contains("ta"));
//		System.out.println(str.indexOf('t'));
//		System.out.println(str.substring(8));
		
		String[] names=str.split(",");
		
		for(int i=0;i< names.length;i++) {
			System.out.println(names[i]);
		}
		
		
	}
}
