package com.java.backend;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);

//		System.out.println("enter the day  : ");
//		int day=scn.nextInt();  //dynamic 
		//		int day=6;   //manually


//		switch(day) {
//
//		case 1:
//			System.out.println("monday");
//			break;
//		case 2:
//			System.out.println("tuesday");
//			break;
//		case 3:
//			System.out.println("wed");
//			break;
//		case 4:
//			System.out.println("thursday");
//			break;
//		case 5:
//			System.out.println("friday");
//			break;
//		case 6:
//			System.out.println("sat");
//			break;
//
//		}

		System.out.println("enter the item want to order  : ");

		String menu=scn.next();
		switch(menu) {
		case "pizza":
			System.out.println("you ordered pizza");
			break;
		case "burger":
			System.out.println("you ordered burger");
			break;
		default:
			System.out.println("please order the item in the menu");
			break;

		}
	}
}
