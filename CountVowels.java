package com.java.backend.oops;

public class CountVowels {

	
public static void main(String[] args) {
	
	String str="MAhadev";
	String name=str.toUpperCase();
	
	System.out.println("name   ==>"+name);
	int count=0;
	
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i) =='A' || name.charAt(i) =='E' || name.charAt(i) =='I' || name.charAt(i) =='O' || name.charAt(i) =='U' ) {
			count++;
		}
	}
	
	System.out.println(count);
}
}
