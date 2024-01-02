package com.java.backend.oops;


abstract class Bank{
	
	abstract double roi(); 
}

class SBI extends Bank{

	@Override
	double roi() {
		return 7.6;
	}
	
}

class Karnataka extends Bank{

	@Override
	double roi() {
		return 8.5;
	}
	
}

public class BankTest {
 public static void main(String[] args) {
	
	 
	 Bank b;
	 b=new SBI();
	 System.out.println(b.roi());
	 b=new Karnataka();
	 System.out.println(b.roi());
//	 
//	 Bank b = new SBI();
//
//	 SBI sbiObj = (SBI) b;
//
//	 double sbiRoi = sbiObj.roi();

}
}
