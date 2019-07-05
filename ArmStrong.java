package com;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=371, result=0;
		int Original = num;
		while(num != 0) {
			int reminder = num%10;
			result += Math.pow(reminder,3);
			num = num/10;
		}
		System.out.println("result is "+ result);
		
		if(result == Original) 
			System.out.println("Given number is a Armstrong");			
		else
			System.out.println("Given number is not Armstrong");
		
	}

}
