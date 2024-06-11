package FinalCodingJava;
import java.util.Scanner;
public class Scanner_Class
{
	 static void add () 
	{
		int Operant1 = 100;
		int Operant2 = 200;
		System.out.println(Operant1 + Operant2);	
	}
	 static void sub() 
	 {
		 double  a = 68426;
		 double b = 84264;	 
		 System.out.println(a-b);	 
	 }
	public static void main(String[] args) 
	{
		Scanner S1 = new Scanner(System.in);	
	     int add = 	S1.nextInt();
		System.out.println(add);
		 double sub = S1.nextDouble();
			System.out.println(sub);
	}
}
