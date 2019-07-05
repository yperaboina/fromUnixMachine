package sele1;

public class RemoveSpacesInString {
	
	public static void removeSpaces(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ')
				System.out.print(ch);
			
		}
		
	}

	public static void main(String[] args) {
		
		String s1="Are you Indian or American or Pakisthani?";
		
        removeSpaces(s1);
	}

}
