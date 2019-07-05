package com;

public class ReverseANumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=1232, reverse=0;
			int Original = num;
			while(num != 0) {
				int digit = num%10;
				reverse = reverse*10 + digit;
				num = num/10;
			}
			System.out.println("Reveresed number is "+ reverse);
			
			if(reverse == Original) 
				System.out.println("Given number is a polindrom");			
			else
				System.out.println("Given number is not polindrom");
	}

}
