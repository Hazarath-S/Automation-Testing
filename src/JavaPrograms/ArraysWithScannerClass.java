package JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysWithScannerClass 
{
	public static void main(String[] args) 
	{
		System.out.println("The First Arrays Values is :");
		Scanner S1 = new Scanner(System.in);
		String RollNo[] = new String[3];
		
		for(int i =0;i<RollNo.length;i++)
		{
			System.out.println("Enter the Arrays is :"+i);
			RollNo[i] = S1.next();
		}
		System.out.println(Arrays.toString(RollNo));
	}
}
