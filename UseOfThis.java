package com;

public class UseOfThis {
	
	int a, b;
	
	UseOfThis(){
		super();
		System.out.println("constructor");
		
	}
	
	public void setData(int a, int b){
		this.a=a;
		this.b=b;
		
		//System.out.println("a value is "+ a);
		//System.out.println("b value is "+ b);
		
	}
	
	public void showData(){
		System.out.println("A value is "+ a);
		System.out.println("B value is "+ b);
	}

/*	
public void setData1(int a, int b){
	this.a = a;
	this.b = b;
		
	}
	*/
	
	public static void main(String[] args) {
		
		UseOfThis uot = new UseOfThis();
		uot.setData(12, 5);
		uot.showData();
		uot.setData(11, 7);
		uot.showData();
       
		
	}

}
