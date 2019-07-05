package javaprograms;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        
    		String str1=    "Mother In Law";
            String str2=    "Hitler Woman";
        
            String s1 = str1.replaceAll("\\s", "");           
           	System.out.println(s1);
           	
            String s2 = str2.replaceAll("\\s", ""); 
            System.out.println(s2);
        

            
            if(s1.length()==s2.length()){
                
                
            char[]ch1=     s1.toLowerCase().toCharArray();
            	                
            char[]ch2=    s2.toLowerCase().toCharArray();
            
           
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
                       
          Arrays.equals(ch1,ch2);
          System.out.println(str1 +" and " +str2+ "are anagrams");
            }
          else 
              
              System.out.println(str1 +"and" +str2+ "are not anagrams");
            
           
            
    }

}