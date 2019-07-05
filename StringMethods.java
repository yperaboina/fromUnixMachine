package pack1.pack1;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String originalString = "Bhagyanagar Krishna Narayanadri";
		System.out.println(originalString.replace('y', 'Y'));
		
		String originalString1 = "Bhagyanagar Krishna Narayanadri Padmavathi";
		System.out.println(originalString1.replaceAll("na", "**"));
		
		String s = "Hel\n lo";
		System.out.println(s);
		
		String s1 = "Hel \nlo";
		System.out.println(s1);
		
		String s2 = "Hel\r lo";
		System.out.println(s2);
		
		String s3 = " \\t\\t Sheep \\nGoat";
		System.out.println(s3);
		
		String S3 = " Sheep\tGoat";
		System.out.println(S3);
		
		String s4 = " sheep\' goat";
		System.out.println(s4);
		
		String sUrl="http./myhost.com";
		System.out.println(sUrl.replaceAll("./", "://"));

	}

}
