package JavaPrograms;
import java.util.Scanner;
public class Area
{
	static double getRandomRadius()
	{
		return Math.random()*10 + 1;	
	}
	static double CalculateArea(double radius)
	{
		double PI = Math.PI;
		return PI *radius*radius;	
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner S1 = new Scanner(System.in);
		
		for (int i =0;i<=9;i++);
		double radius = getRandomRadius();
		double area  = CalculateArea(radius);
		int i = 0;
		System.out.println("radius "+ (i+1) + " is:" + radius);
        System.out.println("Area of Circle "+ (i+1) + " is:" + area);	
	}

}
