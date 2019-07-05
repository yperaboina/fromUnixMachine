package com;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reminder;
		boolean isPrime=true;
		int numberToCheck = 11;
		
		for(int i=2; i<=numberToCheck/2;i++) {
			reminder=numberToCheck%i;
			System.out.println(numberToCheck + " is devided by "+i+" gives a reminder is "+reminder);
			
		       //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
			if (reminder==0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime)
		     System.out.println(numberToCheck + " is a Prime number");
		  else
		     System.out.println(numberToCheck + " is not a Prime number");

	}

}
