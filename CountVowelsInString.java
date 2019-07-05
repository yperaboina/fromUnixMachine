package sele1;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "counting vowels in English laguage".toLowerCase();
		String s1 = "counting vowels in English laguage";
		//String s2= "xyzaeiou";
		//String s=s1.toLowerCase();
		System.out.println(s);
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'|| ch== 'e'|| ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
