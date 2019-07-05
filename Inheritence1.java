package pack1.pack1;

//Instance1 & Instance2 class also related to inheritence.
//https://javaconceptoftheday.com/java-inheritance-practice-coding-questions/2/

class A{
	static{
		System.out.println("THIRD");
	}
}
class B extends A{
	static{
		System.out.println("SECOND");
	}
}
class C extends B{
	static{
		System.out.println("FIRST");
	}
}

class XX{
	public XX(){
		System.out.println("XX constructor called");
	}
}
class YY extends XX{
	public YY(){
		System.out.println("YY constructor called");
	}
}
class ZZ extends YY{
	public ZZ(){
		System.out.println("ZZ constructor called");
	}
}

class ParentX{
	ParentX(int x){
		System.out.println(1);
	}
}
class ChildY extends ParentX{
	ChildY(){
		super(10);
		System.out.println(2);
	}
}

public class Inheritence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		
		ZZ zz=new ZZ();
		
		ChildY cy= new ChildY();
		
		
	}

}
