package com.java.backend.oops;

interface Hero{  
	
 
	abstract void run();  
	
 
}  


class Honda implements Hero{  
	
	public void run(){
		System.out.println("running safely..");
		}  
}  

public class TestAbstraction{  
		public static void main(String args[]){  
			Hero obj = new Honda();  
		obj.run();  
	}  
}  