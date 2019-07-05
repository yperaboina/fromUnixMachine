package pack1.pack1;

public class Instance1 {
	
	static int count =0;
	//instance block
	{ 
		System.out.println("count value in instance block is .... before..."+count);
		count++;
		System.out.println("count value in instance block is .... after..."+count);
	}
	
	//no-org constructor
	Instance1(){
		System.out.println("no-org constructor called");		
	}
	
	//int-org constructor
	Instance1(int x){
		System.out.println("int-org constructor called");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance1 i=new Instance1();
		System.out.println("count value 1st time is ...."+count);
		Instance1 i2=new Instance1();
		System.out.println("count value 2nd time is ...."+count);
		Instance1 i3=new Instance1(10);
		System.out.println("count value 3rd time is ...."+count);
	}

}
