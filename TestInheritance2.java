package com.java.backend.oops;

class Animal{  
void eat(){
	System.out.println("eating...");
	}  
}  

class Dog extends Animal{  
void bark(){
	System.out.println("barking...");
	}  
}  

class BabyDog extends Dog{  
void weep(){
	System.out.println("weeping...");
	}  
}


class TestInheritance2{  
public static void main(String args[]){  
	
	
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  

System.out.println("=============================");
System.out.println("=============================");
Dog d1=new Dog();
d1.bark();
d1.eat();


}}  

