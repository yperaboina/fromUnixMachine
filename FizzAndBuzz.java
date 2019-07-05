package javaprograms;

public class FizzAndBuzz {

	public static void main(String[] args) {

		int s[] = { 1, 2, 3, 4 };
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {
				for (int c = 0; c < 4; c++) {
					for (int d = 0; d < 4; d++) {
						if (a != b && b != c && c != d && d != a) {
							// System.out.println("Combinations are:"+s[a]+""+s[b]+""+s[c]+""+s[d]+"");
							System.out.println("Combinations are:" + s[a] + s[b] + s[c] + s[d]);

						}
					}
				}
			}
		}

		//int n = 100;
		/*
		 * for (n = 1; n <= 10; n++) {
		 * 
		 * if (n % 3 == 0) { System.out.println(n + " is BUZZ "); } if (n % 5 == 0) {
		 * System.out.println(n + " is FIZZ "); } else if (n % 3 != 0 && n % 5 != 0) {
		 * System.out.println(n + " FIZZ and BUZZ "); } }
		 */
		
		for (int n=1;n<=15;n++) {
			if(n%3==0) {
				System.out.println(n+" is FIZZ");
			}
			if(n%5==0) {
				System.out.println(n+" is BUZZ");
			}
			if(n%3==0 && n%5==0) {
				System.out.println(n+" is FIZZ and BUZZ");
			}
			else if(n%3!=0 && n%5!=0)
				System.out.println(n+ " is NOT FIZZ and BUZZ");
			
		}

	}
}