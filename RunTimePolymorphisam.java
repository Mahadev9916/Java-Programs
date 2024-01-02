package com.java.backend.oops;

class Lang{

	void info() {
		System.out.println("normal lang...");
	}
}

class Java extends Lang{

	@Override
	void info() {
		System.out.println("Java lang...");
	}
}

public class RunTimePolymorphisam {
	public static void main(String[] args) {
		Java java=new Java();
		java.info();
		Lang lang=new Lang();
		lang.info();
	}
}
