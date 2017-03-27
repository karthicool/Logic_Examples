
public class ReverseStr {
private static String str="karthik";
private static String rev_Str="";
public static void main(String[] args) {
	System.out.println("method 1 using StringBuffer"+" "+new StringBuffer(str).reverse());
	System.out.println("method 2 using StringBuilder"+" "+new StringBuilder(str).reverse());
	if(str!=null)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			rev_Str=rev_Str+str.charAt(i);
		}
	}
	System.out.println("method 3 using Logic"+" "+rev_Str);
}
}
