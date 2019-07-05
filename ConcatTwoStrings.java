package sele1;

public class ConcatTwoStrings {
	
	/*using + operator
	Best Use:  When concatenating the constant strings.
	Worst Use:  When using + operator inside loop. */
	public static void concatWithPlus() {
		String str1="Hello";
		String str2 = "World";
		//String str3 = str1+str2; 
		//System.out.println(str3);
		
		String str= str1+"World";
		System.out.println(str);
	}
	
	/* Using String.concat() method
	 * Best Use:   When concatenating string objects.
	 * Worst Use: When using on dynamic objects, if str1 becomes null before concat() method it will throw NullPointerException.
	 */
	
	public static void usingConcatMethod() {
		
		String str1="Hare";
		String str2 = "Krishna";
		String str3 = str1.concat(str2);
		System.out.println(str3);
	}
	
	/* Using StringBuffer
	 * Best Use:  When concatenating large number of string objects in multithreaded application.
	 * Worst Use:  When creating StringBuffer object inside loop.
	 */
	
public static void usingStringBuffer() {	
		String str1="Surya";
		String str2 = "Krishna";
		
		//StringBuffer str1 = new StringBuffer("Surya");
		//StringBuffer str2 = new StringBuffer("Krishna");
		StringBuffer sb = new StringBuffer();
		sb.append(str1).append(str2);
		System.out.println(sb);
	}

	/* Using StringBuilder
	 * Best Use:   When concatenating large number of string objects in single threaded application.
	 * Worst Use: When creating StringBuilder object inside loop or using in multithreaded application can lead unexpected result. 
	 */
	public static void usingStringBuilder() {	
		String str1="Surya";
		String str2 = "Chanra";
	
		//StringBuffer str1 = new StringBuffer("Surya");
		//StringBuffer str2 = new StringBuffer("Krishna");
		StringBuilder sb = new StringBuilder();
		sb.append(str1).append(str2);
		System.out.println(sb);
	}
	
	
	public static void usingStringJoin8version() {	
		String str1="Earth";
		String str2 = "Water";
		String str = String.join("", str1, str2);
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concatWithPlus();
		usingConcatMethod();
		usingStringBuffer();
		usingStringBuilder();
		usingStringJoin8version();
	}

}
