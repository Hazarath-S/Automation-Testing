package JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class booleanScannerClass 
{
	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);	 
		boolean name[] = new boolean[3];	
		for(int i=0;i<name.length;i++) 
		{
			System.out.println("Enter the Boolean datatype :"+i);
			name[i]   =S1.nextBoolean();			
		}
		System.out.println(Arrays.toString(name));		
	}

}
