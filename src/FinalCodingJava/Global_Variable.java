package FinalCodingJava;
public class Global_Variable 
{
	void add() 
	{
		int Operant1 = 100;
		int Operant2 = 200;
		System.out.println(Operant1 +  Operant2 );	
	}
	void sub1() 
	{
		byte Operant1 = 12;
		byte Operant2 = 35;
		System.out.println(Operant1 - Operant2);	
	}
	void mul() 
	{
		short Operant1 = 200;
		short Operant2 = 300;
		System.out.println(Operant1 * Operant2);	
	}
	void sub() 
	{
		long Operant1 = 100;
		long Operant2 = 150;
		System.out.println(Operant1 - Operant2);	
	}
	void div() 
	{
		float Operant1 = 25402100;
		float Operant2 = 35625;
		System.out.println(Operant1 /Operant2);	
	}
	void add1() 
	{
		char name = 'H';
		char name1 = 'Y';
		System.out.println(name+name1);	
	}
	void add2() 
	{
		String Na = "Hazarath";
		String Na1 = "Testing";
		System.out.println(Na+Na1);
	}
	public static void main(String[] args) 
	{
		Global_Variable   A1 = new Global_Variable();
		A1.add();
		A1.add1();
		A1.add2();
		A1.mul();
		A1.sub();
		A1.sub1();
	}
}
