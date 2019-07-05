package pack1.pack1;


/*
Which of the following statement is true ?
Whenever we are creating child class object then automatically parent class object will be created.(false)
Whenever we are creating child class object then parent class constructor will be executed.(true)
 */
abstract class ParentA {
	
	
	ParentA()
	{
		System.out.println(this.hashCode() + "...Hello parent constructor"); //here this means child class object
		
	}	
	{

		System.out.println("instance block executed");
	}
}

class ChildB extends ParentA{
	
	ChildB(){
		System.out.println(this.hashCode() + "...Hello child constructor");
	}
}

public class ConstructorParent1{
	
	public static void main(String[] args) {
		ChildB c = new ChildB();
		System.out.println(c.hashCode());
		

	}

}
