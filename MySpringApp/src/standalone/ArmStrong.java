//Find armstrong number between 1 to 1000
public class ArmStrong {
public static void main(String[] args) {
	int sum=0,c=0;
	int num;
	for(int i=1;i<=1000;i++)
	{
		num=i;
		while(num>0)
		{
		c=num%10;
		num=num/10;
		sum=sum+(c*c*c);
		}
		if(sum==i)
		{
			System.out.println("This is a armstrong number"+i);
		}
		sum=0;
	}
}
}
