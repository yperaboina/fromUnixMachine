package javaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections4.iterators.IteratorChain;

public class map {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>(); 
	      
        // enter name/url pair 
		map.put("GFG", "geeksforgeeks.org"); 
		map.put("Practice", "practice.geeksforgeeks.org"); 
		map.put("Code", "code.geeksforgeeks.org"); 
        
        System.out.println(map);
        
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
        	
        	
        	String a=(String) entries.next();
        	
        	System.out.println(a);
        	
        	}
        	
		
	}

}
