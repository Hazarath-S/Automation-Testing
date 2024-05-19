package JavaPrograms;
public class ThisCallingStatement
{    
	 void Hazarath()
	 {
		System.out.println("1");
	 }
	 void Hazarath(int a)
	 {
		 this.Hazarath();
		 System.out.println("2");
	 }
	 void Hazarath(double a)
	 {
		 this.Hazarath(100);
		 System.out.println("3");
	 }
	public static void main(String[] args)
	{
		ThisCallingStatement t1 = new ThisCallingStatement();
		t1.Hazarath(20.20);				
	}
	
}
