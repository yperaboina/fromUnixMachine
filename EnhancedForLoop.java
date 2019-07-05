package sele1;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3,4,5};
		
		for (int number:numbers) {
			System.out.print(number);
			System.out.print(",");
			
		}
		
		System.out.println();
		String[] names = {"Hari", "Rama", "Rudra","Krishna", "Vivek"};
		for(String name : names) {
			System.out.print(name);
			System.out.print(",");
		}

	}

}
