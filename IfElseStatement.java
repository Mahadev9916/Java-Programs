package com.java.backend;

public class IfElseStatement {

	public static void main(String[] args) {
		
		double accbal=5000.00;
		double amount=6000.00;
		
		
		if(amount <accbal) {
			accbal=accbal-amount;
			System.out.println("Withdraw Successful");
		}else {
			System.out.println("Withdraw Failed");
			System.out.println("Insuffiecient Balance");
		}
		
		System.out.println("Account balance "+accbal);
	}
}
