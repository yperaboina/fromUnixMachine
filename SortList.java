package sele1;

import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] inputList = {"Jan", "Feb", "Mar","April","May", "June", "july","Aug","Sept","nov", "Dec"};
		
		// Display input un-sorted list.
		System.out.println("before sort "+ inputList);
		showList(inputList);
		
		//call to sort the input list
		Arrays.sort(inputList);
		
		// Display the sorted list.
		System.out.println("after sort "+ inputList);
		showList(inputList);
		
		// Call to sort the input list in case-sensitive order.
			System.out.println("\n-------Sorted list (Case-Sensitive)-------");
			Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

			// Display the sorted list.
			showList(inputList);

	}

	public static void showList(String[] array) {
		for(String str:array) {
			System.out.println(str +" ");
		}
		System.out.println();
	}
	
}
