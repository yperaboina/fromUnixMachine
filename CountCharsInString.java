package sele1;

public class CountCharsInString {
	
	public static void main(String[] args) {
		
		String str = "it is 17 chars String";
		//String str = " i   x   ";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);			
			if(ch!=' ')
			 count++;
		}
		System.out.println(count);
	}

}
