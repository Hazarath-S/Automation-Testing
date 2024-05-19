package JavaPrograms;

public class Arrays 
{
	public static void main(String[] args) 
	{
	 String Names[]= new String[3];
		//Declare & Initialize the Variables
		
		Names[0] = "Hazarath";
		Names [1] = "PavanKumar Valajala";
		Names [2] = "Kiran Kumar";
		
		int rollno[] = new int[4];
		rollno[0]=78;
		rollno[1]= 54;
		rollno[2]= 21;
		rollno[3]=25;
		//System.out.println("The list of the rollno is :");
		
		System.out.println("The Names in the List  is : ");

		for(int i =0;i<3;i++) {
			
			System.out.println(Names[i] +" "+ rollno[i]);
		}
	}

}
