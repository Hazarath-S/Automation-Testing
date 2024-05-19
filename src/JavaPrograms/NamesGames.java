package JavaPrograms;
public class NamesGames 
{
	public static void main(String[] args) 
	{
		String Name = "Hyandav Narayana Pilla";
		System.out.println(Name.length());
		System.out.println(Name.charAt(15));
		System.out.println(Name.indexOf('P'));
		
		String First_Name = "Hyandav";
		String Last_Name = "NarayanaPilla";
		System.out.println(First_Name.concat(" ").concat(Last_Name));
		System.out.println(First_Name.contains(First_Name));
		System.out.println(Last_Name.contains(Last_Name));
		
		String Name_Of_the_Project = "                       The New Automation Batch is Started in the April2nd           ";
		System.out.println(Name_Of_the_Project);
		System.out.println(Name_Of_the_Project.trim());
		System.out.println(Name.toLowerCase());
		System.out.println(First_Name.toLowerCase());
		System.out.println(Last_Name.toLowerCase());
		System.out.println(Name_Of_the_Project.toLowerCase());
		
		System.out.println(Name.toUpperCase());
		System.out.println(First_Name.toUpperCase());
		System.out.println(Last_Name.toUpperCase());
		System.out.println(Name_Of_the_Project.toUpperCase());
	}

}
