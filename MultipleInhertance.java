package com.java.backend.oops;



interface A{
	void eat();
}

interface B{
	void travel();
}

class C implements A,B{

	@Override
	public void travel() {
		System.out.println("travelling");
	}

	@Override
	public void eat() {
		System.out.println("eating...");
		
	}
	
}
public class MultipleInhertance {
  public static void main(String[] args) {
	C obj=new C();
	obj.eat();
	obj.travel();
}
}
