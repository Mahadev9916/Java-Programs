package com.java.backend.oops;

public class AirthmeticException {

	public static void main(String[] args) {

		try {

			int a=10;
			int b=0;
			int c=a/b;

			System.out.println("output "+c);
		}	catch (NullPointerException e) {
			System.out.println("null point exception");
		}
		catch (ArithmeticException e) {
			System.out.println("can't able to perform opration:");

		}
	}
}

