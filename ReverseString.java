package com.java.backend;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="gadag";
		String s2="";
		
		
		for(int i=0; i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println("reverse the string: "+s2);
		
		if(s1==s2) {
			System.out.println("it is palindromic");
		}else {
			System.out.println("it is not palindromic");
			
		}
		
//		for(int i=s1.length()-1;i>0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		System.out.println("reverse the string: "+s2);
		
		
//		StringBuilder  sb=new StringBuilder(s1);
//		System.out.println("reverse===>"+sb.reverse().toString());
	}
}
