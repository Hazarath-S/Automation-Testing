package FinalCodingJava;
public class Nested_ifElse_Block
{
	public static void main(String[] args) 
	{
		int operant1 = 200;
		int operant2 = 300;
		if(operant1 >= operant2)
		{
			if(operant1< operant2) 
			{
				System.out.println("This is valid");		
			}
			else if (operant1 <= operant2)
			{
				System.out.println("My code is not valid");	
			}		
		}
		else
		{
		System.out.println("This is not good Approach");	
		}
	}
}
