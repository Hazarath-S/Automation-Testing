package JavaPrograms;
class Superman 
{
	 Superman()
	{ 
		System.out.println("The Superman is Calling Output");
	}	
}
 class Superwomen extends Superman
{
   Superwomen(int a, double b, String c) 
 {
	 System.out.println("The Superwomen is Calling Output");
 }
}
public class SuperCallingStatement extends Superwomen
{
	SuperCallingStatement(int c )
	{
		super(10,20.20,"Man");
		System.out.println("The Superwomen is Calling Output");
	}
	public static void main(String[] args)
	{
		SuperCallingStatement S1 = new SuperCallingStatement(20);	
	}
}
