package com.java.backend;

import java.util.Scanner;

public class ScannarClass {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		System.out.println("Enter age: ");
		System.out.println("Enter salary: ");
		
		String name=scn.nextLine(); //next vs nextline
		int age=scn.nextInt();
		double salary=scn.nextDouble();
		
		
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("salary : "+salary);
	}
}
