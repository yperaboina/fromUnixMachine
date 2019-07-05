package javaprograms;
public class Palindrome {

	  public static void main(String args[])
	    {
	        String a="aeeda", b = "";
	       // Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	      //  a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        	
	        {
	            System.out.println("The string is not palindrome.");
	        }
	        
	        
	        String st="venkatesh";
	        String c="";
	        int b1= st.length();
	        
	        for (int j =b1-1; j >=0; j--) {
	        	
	        	 c=c+st.charAt(j);
	        	
	        			
				
			}
	        System.out.print("revers "+c);
	    }
	  
}

