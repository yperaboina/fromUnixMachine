package pack1.pack1;

class ParentStatic1{
	public  static void meth1(){
		System.out.println("parentStatic method");
	}
}
class ChildStatic1 extends ParentStatic1{
	public static void meth1(){
		System.out.println("ChildStatic method");
	}

	
}

public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildStatic1  cs = new ChildStatic1();
		cs.meth1();
	}

}
