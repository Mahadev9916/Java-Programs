package com.java.backend;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter the number ");
		int n=scn.nextInt();
		
		int count = 0;
		
		while (n!=0) {

			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
