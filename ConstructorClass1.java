package pack1.pack1;
interface x {
	public abstract void m1(double x);
}
interface y { 
	public abstract int m1(int x);
}

public class ConstructorClass1 extends Object implements x,y{
	
	private ConstructorClass1(){
		System.out.println("constructor called");
		this.sum();
	}
	
	public  void sum(){
		System.out.println("sum method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass1 con1 = new ConstructorClass1();
		System.out.println(con1);
		System.out.println(con1.toString());
	}



	@Override
	public void m1(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m1(int x) {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
