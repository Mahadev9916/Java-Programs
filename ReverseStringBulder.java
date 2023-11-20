package com.mahadev.CodingPractice.String;

public class ReverseStringBulder {

	public static void main(String[] args) {
		
		String str="mahadev";
		
		StringBuilder strblr=new StringBuilder(str);
		String reverse=strblr.reverse().toString();
		System.out.println("reverse ==>"+reverse);
	}
}
