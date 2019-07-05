package javaprograms;
class charcount
{
	public static void main(String arg[])
	{
		
		String name="venkatvenky";
		
		char[] c=name.toCharArray();
		int size=c.length;
		int count=0;
		for (int i = 0; i < size; i++) {
			boolean flag=true;
			for (int j = 0; j <i; j++) {
				if (c[i]==name.charAt(j)) {
					flag=false;
				}				
			}
				if (flag) {
				for (int j2 = 0; j2 < size; j2++) {
					if (c[i]==name.charAt(j2)) 
						count=count+1;
				}
				//System.out.print(c[i]+""+""+(count));
				System.out.println(c[i]+" "+" "+(count));

				count=0;
			}
				}
			}
			
							
		
	}