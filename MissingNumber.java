package pack1.pack1;

public class MissingNumber {
	
	static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        return total; 
    } 
  
    /* program to test above function */
    public static void main(String args[]) 
    { 
        //int a[] = { 1, 2, 4, 5, 6 };
    	//int a[] = { 31, 32, 34, 35, 36 };
    	int a[]= {6,8,9,10,11};
        int miss = getMissingNo(a, 5); 
        System.out.println(miss); 
    } 

}
