package FinalCodingJava;

import java.util.Scanner;

public class Arrays_Program 
{
	public static void main(String[] args)
	{
		
		Scanner S1 = new Scanner(System.in);
		int Roll[] = new int [3];
		
		for(int i =0;i<3;i++)
		{
			System.out.println("The Arrays values are:"+i);
			Roll[i] = S1.nextInt();
			System.out.println(Roll[i]);
			
		}

	}

}
