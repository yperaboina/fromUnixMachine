package javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDouplicates {

    public static void main(String[] args) {
    	String s = "venkatvenky";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    found = true;
                    break; //don't need to iterate further
                }
            }
            if (found == false) {
               s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.print(s2);

    	
        
    	
    	String string = "aabbccdefatafaz";

    	char[] chars = string.toCharArray();
    	Set<Character> charSet = new LinkedHashSet<Character>();
    	for (char c : chars) {
    	    charSet.add(c);
    	    
    	    StringBuilder sb = new StringBuilder();
    	    for (Character character : charSet) {
    	    	sb.append(character);
    	    }
    	    
    	    
    	    System.out.println(sb.toString());
    	}
    	
    	
    }

}