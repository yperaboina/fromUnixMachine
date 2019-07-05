package com;

public class GarbageCollector1 {
	
	int a;
	int b;
	
	public void setData(int c, int d) {
		a=c;
		b=d;		
	}
	public void showData() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

	public static void main(String[] args) throws Exception{
		
		//How to delete an object in Java?
		//1) If you want to make your object eligible for Garbage Collection, assign its reference variable to null.
		//2) Primitive types are not objects. They cannot be assigned null.
		
		GarbageCollector1 gc1 = new GarbageCollector1();
		GarbageCollector1 gc2 = new GarbageCollector1();
		gc1.setData(1, 2);
		gc2.setData(3, 4);
		gc1.showData();
		gc2.showData();
		System.out.println("showed gc1, gc2 values");
		GarbageCollector1 gc3;
		gc3=gc2;
		System.out.println("showing gc3 values");
		gc3.showData();
		gc2 = null;
		System.out.println("gc2 made it null");
		gc3.showData();
		System.out.println("making gc3 null");
		gc3=null;
		gc3.showData();

	}

}
