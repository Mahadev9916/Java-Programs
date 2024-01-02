package com.java.backend;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		
		int x=12;
		int y=15;
		int z=10;
		
		int largestNumber=(x>y) ? (x>z ? x:z) :(y>z? y:z);
		System.out.println(largestNumber+" is largest");

		
		
	}

}
