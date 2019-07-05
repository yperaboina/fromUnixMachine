package pack1.pack1;

public class ConstructorInstanceStatic {
	
	ConstructorInstanceStatic(){
		System.out.println("constructor called");
	}
	
	//it (static block) will be execute without creating the object of the class
	static{
		System.out.println("static called");
	}
	
	{
		System.out.println("Instance called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method called");
		/* output will be as below before object is created.
	       static called
		   Main method called
		*/
		
		
		ConstructorInstanceStatic cis = new ConstructorInstanceStatic();
		
		/* output will be as below after object is created.
		    static called
			Main method called
			Instance called
			constructor called
		 */
	}

}
