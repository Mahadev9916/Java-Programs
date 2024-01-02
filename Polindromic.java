package com.java.backend;

public class Polindromic {

	public static void main(String[] args) {
		String s1="puttuswamy";
		String s2="";
		
		
		for(int i=0; i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println("reverse the string: "+s2);
		
		if(s1.equals(s2)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not  palindrom");
			
		}
		
	}
}
