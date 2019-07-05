package pack1.pack1;


import java.text.SimpleDateFormat;
import java.util.*;

public class StringtoDate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
		String s = "Jun 2, 2019";
		Date d = new SimpleDateFormat("MMMM d, yy", Locale.ENGLISH).parse(s);
		System.out.println(d);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
