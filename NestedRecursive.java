package pack1.pack1;

/* 
 Nested call:
Calling a function inside another function is called nested call.
In nested call there is a calling function which calls another function(called function). 
 */

public class NestedRecursive {
	
	public void m1(){
		System.out.println("m1 is executing");
		m2();
	}
	public void m2(){
		System.out.println("m2 is executing");
		//m1();//un-comment it if you want to see execution of NESTED CALL behaviour.
		//you will get StackOverflowError
	}
	
	public void m3(){
		System.out.println("m3 is executing");
		//m3();//if un-comment this you will get StackOverflowError
	}
	
	public static void main(String[] args){
		NestedRecursive nr = new NestedRecursive();
		nr.m1();
		nr.m3();
	}

}
