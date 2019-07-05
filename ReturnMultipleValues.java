package snapfish;

import java.util.Arrays;

public class ReturnMultipleValues {
	
	public static int[] getDetails() {
		int v1=20;
		int v2=30;
		int v3=40;
		
		return new int[] {v1, v2, v3};
	}
	
	public static Object[] getPerson() {
		String name = "Vivek";
		int age = 32;
		long mobileNo= 1234567890;
		
		return new Object[] {name, age, mobileNo};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ins = getDetails();
		System.out.println(Arrays.toString(ins));
		
		Object[] obj = getPerson();
		System.out.println(Arrays.toString(obj));
	}

}
