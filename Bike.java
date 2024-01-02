package com.java.backend.oops;



class Vehicle{
	
	void run(int a) {
		System.out.println("vehicle running at speed "+a);
	}
	
}




public class Bike extends Vehicle {

	@Override
	void run(int a) {
		System.out.println("Bike running at speed "+a);
	}
	
	public static void main(String[] args) {
		
		Vehicle vec=new Vehicle();
		Bike bike=new Bike();
		bike.run(100);
		vec.run(200);
		
		
	}
}
