import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pattern {
public static void main(String[] args) throws NumberFormatException, IOException {
	System.out.println("Enter size of pattern");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int size=Integer.parseInt(br.readLine());
	int pos=1;
	int no_of_spaces=size/2+1;
	for(int i=1;i<=size;i++)
	{
		for(int j=1;j<=no_of_spaces;j++)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=pos;j++)
		{
		    System.out.print("*");
		}
		System.out.println();
		pos=pos+2;
		no_of_spaces=no_of_spaces-1;
		
	}
}
}
