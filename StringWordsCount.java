package sele1;

public class StringWordsCount {
	static int count=0;
	
	public static int wordsCount(String str) {
		
		String[] s = str.split(" ");
		int emptyStringCount=0;
		for (int i=0;i<s.length;i++) {
			if(s[i].isEmpty())
				emptyStringCount++;
		}
		System.out.println("emptyStringCount "+emptyStringCount);
		count=s.length-emptyStringCount;
		return count;
	}
	

	public static void main(String[] args) {
		
		String s1 = " Hello world how are you   doing";
		System.out.println(count = wordsCount(s1));       
	}

}
