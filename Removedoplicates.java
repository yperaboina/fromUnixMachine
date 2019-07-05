package javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removedoplicates {
	
	public static void main(String[] args) {
		
		
		
		String Name="VENKATESHVENKATVENKKY";
		char[] c=Name.toCharArray();
		
		Set<Character> charset= new LinkedHashSet<Character>();
		
		for(char cb:c) {
			
			charset.add(cb);
			System.out.println(charset);
			
			
		}
		
		
		StringBuffer sb= new StringBuffer();
		
		for(Character ch:charset) {
			
			sb.append(ch);
			
			
			
		}
		
		System.out.println(sb);
	}

}
