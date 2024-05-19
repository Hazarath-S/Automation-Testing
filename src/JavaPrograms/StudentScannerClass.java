package JavaPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class StudentScannerClass 
{
	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);
		String Name[] = new String[3];
		
		for(int i =0;i<Name.length;i++) 
		{
			System.out.println("Enter the Arrays is :"+i);
			Name[i] =S1.next();	
		}
		System.out.println(Arrays.toString(Name));	
	}

}
