package JavaPrograms;
import java.util.Arrays;
public class CountofAlphabets 
{
	static int countofalphabet =0;
	public static void main(String[] args) 
	{
		String name = "Pavankumarvalajala";
		char[] C1 = name.toCharArray();
		System.out.println(Arrays.toString(C1));
		
		for(int i=0;i<C1.length;i++)
		{
	boolean type  =Character.isAlphabetic(C1[i]);
	if(type==true) 
	{
		countofalphabet ++;
	}
		}
		System.out.println("TheCountofalphbet is :"+countofalphabet);	
	}
}
