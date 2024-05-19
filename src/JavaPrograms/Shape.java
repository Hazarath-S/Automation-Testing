package JavaPrograms;
interface ShapewithMethodCalcluateArea
{
	void String();	
} 
public class Shape implements ShapewithMethodCalcluateArea
{
	void String1() 
	{
		System.out.println("The String is calcualting the video");	
	}

	public static void main(String[] args)
	

	{
		Shape c1 = new Shape();
		c1.String();
		c1.String1();
	}
	@Override
	public void String()
	{	
		System.out.println("The Number of methods");
	}
}
