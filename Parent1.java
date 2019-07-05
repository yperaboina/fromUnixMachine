package pack1.pack1;


//Inheritence example program
class Parent {
	
	int x=10;
	
	public void pMethod1(){
		System.out.println("pMethod1 called from Parent");
	}

}
class Child extends Parent {
	
	int x=20;
	
	public void cMethod1(){
		System.out.println("cMethod1 called from child");
	}
	
	public void pMethod1(){
		System.out.println("pMethod1 called from Child");
	}

}

public class Parent1{
	public static void main(String[] args){
		Parent p = new Parent();
		p.pMethod1(); //pMethod1 called from Parent
		//p.cMethod1();
		
		Child c = new Child();
		c.pMethod1();//pMethod1 called from Parent
		c.cMethod1();//cMethod1 called
		
		Parent p1 = new Child();
		p1.pMethod1();//pMethod1 called from Child
		//p1.cMethod1();
		System.out.println(p1.x);
		
	/*	Child c1 = new Parent();
		c1.pMethod1();
		c1.cMethod1();
		*/
		
	}
}