package com.java.backend.oops;

public class NullPointExce {

	public static void main(String[] args) {
		try {
			
			String str="arvind";
			System.out.println(str.charAt(10));
		}  catch (ArithmeticException e) {
			System.out.println("can't able to perform opration:");
			
		}catch (NullPointerException e) {
			System.out.println("null point exception");
		}
	}
}
