import java.util.Arrays;


public class Max_Min_Array {
public static void main(String[] args) {
	int arr[]={10,12,18,45,74,111,784,415,50};
	int max1=arr[0];
	int max2=arr[1];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max1)
			max1=arr[i];
		else if(arr[i]>max2)
			max2=arr[i];
	}
	System.out.println("first 2 highest number"+max1+" "+max2);
	/*Arrays.sort(arr);
	System.out.println("max is"+arr[arr.length-1]+" "+"min is"+arr[0]);
	
	for(int i=arr.length-1;i>=arr.length-5;i--)
	{
		System.out.println("first 5 highest number"+arr[i]);
	}*/
}
}
