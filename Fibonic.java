package javaprograms;
public class Fibonic {
	
	public static void main(String[] args) {
		
		
		int n1=0,n2=1,n3=0,count=10;
		
		for (int i =0; i < count; i++) {
			
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			
			System.out.print(" sum="+n3);
			
		}
		  
		
		
	}
	

}

