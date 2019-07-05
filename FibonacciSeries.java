package com;

import java.util.Scanner;

public class FibonacciSeries {

	
	public static int fibonacci2(int number){
		
		if(number==1 || number == 2){
			return 1;
		}
		
		int fib1=1, fib2=1, fibonacci=1;
		for(int i=3; i<=number; i++){
			
			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
		}
		
		return fibonacci;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt(); 
		
		System.out.println("Fibonacci series upto " + number +" numbers : ");
		
		//printing Fibonacci series upto number 
		for(int i=1; i<=number; i++){ 
			System.out.print(fibonacci2(i) +" "); 
		}


	}

}
