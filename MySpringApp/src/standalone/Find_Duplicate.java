
public class Find_Duplicate {
public static void main(String[] args) {
	String str[]={"k","a","r","t","h","i","k"};
	
	for(int i=0;i<str.length;i++)
    {
    	for(int j=0;j<str.length;j++)
    	{
    		if(str[i].equals(str[j]) && i!=j)
    		{
    			System.out.println("found duplicate"+" "+str[i]);
    		}
    	}
    }
}
}
