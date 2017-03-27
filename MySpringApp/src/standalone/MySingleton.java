
public class MySingleton {
private static MySingleton myObj=null;
static{
	myObj=new MySingleton();
}
private MySingleton()
{
	
}
public static MySingleton gSingleton()
{
	return myObj;
}
public void print()
{
	System.out.println("hi this is singleton object creation example");
}
public static void main(String[] args) {
	MySingleton ms=gSingleton();
	ms.print();
}
}
