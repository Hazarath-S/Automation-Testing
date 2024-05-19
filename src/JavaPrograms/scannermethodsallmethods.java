package JavaPrograms;
import java.util.Scanner;
public class scannermethodsallmethods
{
	static int add (int Operant1,int Operant2) 
       {
    	   System.out.println("The Sum of two numbers is : ");
    	   return Operant1+Operant2;
       }
     static void sub (byte Operant1, byte Operant2) 
      {
    	 System.out.println("The two numbers is : ");
    	 return; 	 
      }   
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner("System.in");
		System.out.println("Enter the Operant 1 : ");
		String Operant1 = Sc.next();		
	}
}
