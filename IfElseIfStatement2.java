package com.java.backend;

public class IfElseIfStatement2 {

	
public static void main(String[] args) {

	// a b c 
	
	int a=50;
	int b=40;
	int c=100;
	
	if(a >=b && a>=c) {
		System.out.println(a+" is largest");
	}else if(b>=a && b>=c) {
		System.out.println(b+" is largest");
	}else {
		System.out.println(c+" is largest");
	}
}
}
