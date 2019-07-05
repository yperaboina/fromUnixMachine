package com;

class Animal {
	String color = "white";
	Animal(){
		System.out.println("Animal is created");
	}
}

class Dog extends Animal {
	String color = "black";

	
	void printColor() {
		System.out.println(color);// prints color of Dog class
		//super is used to refer immediate parent class instance variable
		System.out.println(super.color);// prints color of Animal class
	}
}

public class UseOfSuper {
	
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
		}

}
