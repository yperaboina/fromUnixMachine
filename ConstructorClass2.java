package pack1.pack1;

class M
{
    int i;
 
    public M(int i)
    {
    	System.out.println("**** "+i);
        this.i = i--;
        System.out.println("+++++++++ "+i);
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}


public class ConstructorClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     N n= new N(15);
	}

}
