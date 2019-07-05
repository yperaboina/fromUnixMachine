package sele1;

public class StringExample1 {

	public static void main(String[] args) {
	
		
		//1.demonstration of mutable(StringBuffer) and immutable (String)
		String s = new String("Yakaiah");
		s.concat("Peraboina");//not immuted, here another object created by default but that object not assigned to any reference variable.
							//so destroyed by Grabage collector.
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Yakaiah");
		sb.append("Peraboina");
		System.out.println(sb);
		
		System.out.println("-----------------------------");
		//2.deference of "equals" method in String and StringBuffer.
		String s1 = new String("Vivek");
		String s2 = new String("Vivek");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Vivek");
		StringBuffer sb2 = new StringBuffer("Vivek");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		

	}

}
