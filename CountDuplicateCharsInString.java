package sele1;

import java.util.HashMap;

//program to write to duplicate characters in a String.
public class CountDuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charCount("Hello world");
		charCount("aabbcccdde");		

	}
	
	public static void charCount(String str) {
		HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		
		char[] charArray= str.toCharArray();
		
		for(char c:charArray) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);					
			}
			else
				m.put(c, 1);			
		}
		System.out.println(m);
		
		
	}

}
