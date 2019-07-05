package sele1;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcdef";
		System.out.println(""+uniqueChars(str));

	}
	
	public static boolean uniqueChars(String input) {
		
		for(int i=0;i<input.length();i++) {
			
			int count = 0;
			char a = input.charAt(i);
			for(int j=i;j<input.length();j++) {
				if(a==input.charAt(j)) {
					count++;
				}				
				
			}
			if(count>1)
				return false;
			
		}
		return true;
		
	}

}
