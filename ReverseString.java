package com.mahadev.CodingPractice.String;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String str="mahadev";
        String s2="";
		for(int i=str.length()-1;i>=0;i--) {
			char cr=str.charAt(i);
//			s2=str.charAt(i)+s2;
			s2=s2+str.charAt(i);
		}
		System.out.println(s2);

	}
}
