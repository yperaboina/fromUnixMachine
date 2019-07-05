package pack1.pack1;

abstract class ParentAbs{
	public abstract void methodx();
}

class ChildImpl extends ParentAbs{
	public void methodx(){
		System.out.println("abstract method implemented in child class");
	}
	
}

/*
 We can override a non-abstract method as abstract
this approach is helpful to stop availability of Parent method implementation to the next level child classes.
 */
class ParentNonAbs{
	public void methodex(){}
}
abstract class ChildAbs{
	public abstract void methodex(); 
}
public class Overloading2 {

}
