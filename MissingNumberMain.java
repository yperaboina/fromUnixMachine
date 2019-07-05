package javaprograms;
public class MissingNumberMain {
 
	public static void main(String[] args) {
 
		//int[] arr1={7,4,6,1,2,3};
		int[] arr1={39,38,36,41,42};
		
		int missingNumber =0;
		int restSum=0;		
	
		int n=arr1.length+1;
		System.out.println("n value is "+n);
		int sum=n*(n+1)/2;
		System.out.println("sum value is "+sum);
		for (int i = 0; i < arr1.length; i++) {
			restSum+=arr1[i];
		
		 missingNumber=sum-restSum;
		 
		
	}
		
		System.out.println("Missing number from array arr1: "+missingNumber);

		
}
}

