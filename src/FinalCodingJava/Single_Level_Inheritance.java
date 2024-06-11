package FinalCodingJava;
public class Single_Level_Inheritance 
{
	static void add() 
	{
		int operant1 = 100;
		int operant2 = 200;
		System.out.println("The Sum of two numbers is : "+(operant1 + operant2));	
	}
	public static class name extends Single_Level_Inheritance 
	{
		void multiplication() 
		{
			double Operant1 = 2500;
			double Operant2 = 25;
			
			System.out.println("The Multlipaction of two numbers is:"+(Operant1 * Operant2));		
		}	
	}
	
	public static void main(String[] args) 
	{
		name N1 = new name ();
		N1.add();
		N1.multiplication();
}
}
