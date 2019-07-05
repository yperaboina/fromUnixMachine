package pack1.pack1;

class Parent01{
	
	private void methodOne(){
		System.out.println("methodOne of Parent");
	}
}

class Overloading1 extends Parent01{
	private void methodOne(){
		System.out.println("methodOne of Child");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 x= new Overloading1();
		x.methodOne();
		Parent01 p = new Overloading1();
		//p.methodOne();//CE p.methodOne from the type Parent01 is not visible.
		
		Base b = new Derived();
		b.show();
	}
	
}	
	
	class Base {
		public void show() {
		System.out.println("Base::show() called");
		}
	}

	class Derived extends Base {
		public void show() {
		System.out.println("Derived::show() called");
		}
	}


 
