package com.java.backend;

import java.util.Scanner;

//Write a Java program that takes an integer as input and prints whether the number is positive, negative, or zero.

public class IfElseIfStatement {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);

		System.out.println("enter the value of n : ");
		int n=scn.nextInt();
		
		if(n>0) {
			System.out.println("number is positive");
		}else if(n<0) {
			System.out.println("number is negetive");
		}else {
			System.out.println("number is Zero");
		}
	}

}
