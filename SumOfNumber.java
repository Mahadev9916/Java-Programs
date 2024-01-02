package com.java.backend.oops;

public class SumOfNumber {
	
	
	public static void main(String[] args) {
		int n=5;
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		
//		sum=n * (n+1)/2;
		System.out.println("sum of "+n+" is "+sum);
	}
}
