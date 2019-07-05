package javaprograms;
class ReverseNumber
{
public static void main(String args[])
{
int reverse = 0;

//System.out.println("Enter a number to reverse");
/*Scanner in = new Scanner(System.in);
n = in.nextInt();*/
int n=12345;
System.out.println("Enter a number to reverse"+n);

while(n != 0)
{
reverse = reverse * 10;
reverse = reverse + n%10;
n = n/10;

System.out.println(n);
}

System.out.println("Reverse of the number is " + reverse);

}
}