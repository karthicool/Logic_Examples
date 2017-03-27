import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.CHAR_ARRAY;


public class Anagram {
public static void main(String[] args) {
	String str_A="keep";
	String str_B="peek";
	char wrd_A[]=str_A.toCharArray();
	char wrd_B[]=str_B.toCharArray();
	Arrays.sort(wrd_A);
	Arrays.sort(wrd_B);
	//List l=(String)Arrays.asList(wrd_A);
	
	boolean anagram=Arrays.equals(wrd_A, wrd_B);
	if(anagram)
	{
		System.out.println("Yes it is anagram");
	}
}
}
