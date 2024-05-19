package JavaPrograms;
interface outerface
{
	void add ();
	void add1();	
}
interface ringface extends outerface
{
	void sub();
	void sub1();
}
interface olface extends ringface
{
	void mul();
	void mul1();
}
public class Inntefaceone implements olface
{
    void div() 
{
	int Operant1 = 205;
	int Operant2 = 32;
	System.out.println("The Division of two numbers is: "+(Operant1/Operant2));
}
	public static void main(String[]args) 
	{
		Inntefaceone If = new Inntefaceone();
		If.sub();
		If.add();
		If.add1();
		If.sub();
		If.sub1();
		If.mul();
		If.mul1();	
	}	
	public void add() 
	{
		int Operant1 = 250;
		int Operant2 = 300;
		System.out.println("The Sum of the two numbers is : " +(Operant1 + Operant2));
	}	
	public void add1()
	{
		int Operant1 = 25842;
		int Operant2 = 52314;
		System.out.println("The Sum of the two add1 numbers is :" +(Operant1 + Operant2));		
	}
	public void sub()
	{
		int Operant1 = 5421782;
		int Operant2 = 9874621;
		System.out.println("The Sub of the two numbers is :" + (Operant1 - Operant2));		
	}
	public void sub1() 
	{
		int Operant1 = 9875;
		int Operant2 = 5421;
		System.out.println("The Sub of the two sub1 numbers is : " +(Operant1 - Operant2));	
	}
	public void mul() 
	{
		int Operant1 = 85271;
		int Operant2 = 9874632;
		System.out.println("The Multlipaction of two numbers is : "+ (Operant1 * Operant2));	
	}
	public void mul1() 
	{
		int Operant1 = 985;
		int Operant2 = 74;
		System.out.println("The Muliplication of two Mul1 numbers is : " + Operant1 *Operant2);		
	}

}
