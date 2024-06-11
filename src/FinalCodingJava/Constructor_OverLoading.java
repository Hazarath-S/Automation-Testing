package FinalCodingJava;
public class Constructor_OverLoading 
{
	void world()
	{
		int Operant1 = 100;
		int Operant2 = 200;
		System.out.println(Operant1 + Operant2 );	
	}
	void Sub( double a)// Parametrized Constrctor
	{
		System.out.println(20002);	
	}
	void mul(int i) 
	{
		System.out.println(21);
	}
	void addition(int a, double b) 
	{
		System.out.println(2540 +521.021);	
	}
	public static void main(String[] args) 
	{
		Constructor_OverLoading C1 = new Constructor_OverLoading();
		C1.addition(2410, 2510.2012);
		C1.mul(20);
		C1.Sub(2542512);
	}
}
