package pack1.pack1;


class A1
{	
	
		String s= "Class A1";
	
}
class A2 extends A1{
	String s= "Class A2";
	{
	  System.out.println(super.s);
	}
}
class A3 extends A2{
	String s= "Class A3";
	{
		
		System.out.println(super.s);
	}
}

public class Instance2 {

	public static void main(String[] args) {
		A3 a3= new A3();
		System.out.println(a3.s);

	}

}
