package com.java.backend;

public class BitwiseOpertor {

	public static void main(String[] args) {
		
		int x=5;   //0101
		int y=3;   //0011
		
		int andResult= x & y;  
		int orResult= x | y;  
		int xorResult= x ^ y;  
		
//		System.out.println("AND result:  "+andResult);  // 0001
//		System.out.println("OR result:  "+orResult);  // 0111
//		System.out.println("XOR result:  "+xorResult);  // 0110
		
		
		//unary operator
//		x++;  
//		System.out.println("X value:  "+x);  
//        ++x;
//		System.out.println("X value:  "+x);  
//        x--;
//		System.out.println("X value:  "+x);  
//        --x;
//		System.out.println("X value:  "+x);  
		
		//assignment operator
		System.out.println("X value:  "+x);  
		x+=20;
		System.out.println("X value:  "+x);  
		int a=6;
		System.out.println("a value:  "+a);  
		a*=5;
		System.out.println("a value:  "+a);  

		

		
		
		
		
	}
}
