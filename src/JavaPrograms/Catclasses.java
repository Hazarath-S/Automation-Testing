package JavaPrograms;
interface  animalmakingsound
{
	void add();
}
interface dog  extends animalmakingsound
{
	void String();	
}
public class Catclasses implements dog
{
	void add1()
	{
		System.out.println("The Sum of two numbers ");
	}
	public static void main(String[]args) 
	{
		Catclasses Cc = new Catclasses();
		Cc.add1();
		Cc.add();
		Cc.String();	
	}
	@Override
	public void add()
	{
	System.out.println("The Animal is making sound");	
	}
	@Override
	public void String() 
	{
		System.out.println("The Car ");	
	}
}
