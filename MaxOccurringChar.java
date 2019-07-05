package pack1.pack1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MaxOccurringChar {
	
	static int k=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="eeeeeaabbbbccddd";
		
		//HashMap<Character, Integer> h= new HashMap<>();
		TreeMap<Character, Integer> h= new TreeMap<>();
		char[] ch = str.toCharArray();
		for(char c:ch) {
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);				
			}
			else
				h.put(c, 1);
				
		}
		System.out.println(h);	
		
		for(Entry<Character, Integer> entry:h.entrySet()) {
			int j=entry.getValue();
				if(j>k)
				k=j;			
		}
		System.out.println("max value is "+k);
		
	}

}
