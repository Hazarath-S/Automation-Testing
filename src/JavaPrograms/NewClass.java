package JavaPrograms;
interface oldClass
{
	void add();
	void mul();	
}
public  class  NewClass implements oldClass
{
	void sub()	
	{
		int Operant1 = 20;
		int Operant2 = 30;
		System.out.println("The sub of the two numbers is :" +(Operant1 - Operant2));	
	}
	public static void main(String[] args)
	{
		NewClass Nc = new NewClass();
		Nc.sub();
		Nc.add();
		Nc.mul();		
	}
	@Override
	public void add() 
	{
		int Operant1 = 1000;
		int Operant2 = 56201;
		System.out.println("The Sum of the two varibales is : " + (Operant1 + Operant2));	
	}
	@Override
	public void mul()
	{
		int Operant1 = 258210;
		int Operant2 = 251;	
		System.out.println("The Multlipaction of two numbers is : " + (Operant1 *Operant2));
	}
}
