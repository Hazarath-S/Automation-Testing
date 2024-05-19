package JavaPrograms;
public class Arrays1 
{
	public static void main(String[] args) 
	{
		String Names[]= new String[5];
		//Declare & Initialize the Variables of String Methods
		Names[0] = "ArjunReddy";
		Names[1] = "Hazarath";
		Names[2] = "Hyandav";
		Names[3] = "Srinivas";
		Names[4] = "Sarvani";
		
		int RollNo[] = new int[5];	
		// Declare & Intailize the int Variables
		RollNo[0] = 78;
		RollNo[1] = 89;
		RollNo[2] = 75;
		RollNo[3] = 85;
		RollNo[4] = 90;
		
		char gender[]= new char[5];
		// Declare & Intailize the int Variables	 
		gender[0] = 'M';
		gender[1] = 'M';
		gender[2] = 'M';
		gender[3] = 'M';
		gender[4] = 'F';
					 
		System.out.println("Student Name"+ "  "+"RollNo" +"    "+ "gender");
		for(int i = 0;i<5;i++)
		{
			System.out.println( Names[i]+  "     "+RollNo[i]+ "       "+gender[i]);
        }		 		
	}
}
