package pack1.pack1;

import org.apache.commons.exec.util.StringUtils;

public class FindDuplicateChars {

	public static void main(String[] args) {
    String str1 = "aabbccdeefgg";
    String str2 = "azzzcxxeeppf";
    int counter=0;
    for(int i=0;i<=str1.length()-1;i++) {
    	for(int j=0;j<=str2.length()-1;j++) {
    		if(str1.charAt(i)==str2.charAt(j)) {
    			counter++;
    			System.out.println(str2.charAt(j)+" "+counter);
    		}
    		
    		counter=0;
    		
    	}
    }

	}

}
