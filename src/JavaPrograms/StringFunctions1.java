package JavaPrograms;
public class StringFunctions1
{
public static void main(String[] args)
{
	String Name = "Automation Testing Batch";
	String Name1 = "Tosca Testing Batch";
	
	System.out.println(Name.indexOf('m'));
	System.out.println(Name.length());
	System.out.println(Name1.length());
	System.out.println(Name.contains("Batch"));
	System.out.println(Name1.contains("Testing"));
	System.out.println(Name.toUpperCase());
	System.out.println(Name1.toUpperCase());
	System.out.println(Name.toLowerCase());
	System.out.println(Name1.toLowerCase());
	
	String Tite_of_the_Batch = "         The Automation Testing Match started in apr2         ";
	System.out.println(Tite_of_the_Batch);
	System.out.println(Tite_of_the_Batch.trim());
	
}
}
