package com.java.backend.oops;


abstract  class Employ{
	
	abstract void disp();

	
}


public  class AbstractClass extends Employ{

	@Override
	void disp() {

		System.out.println("employ...");
	}

	
	public static void main(String[] args) {
		AbstractClass ab=new AbstractClass();
		ab.disp();
	}
	
	

}
