package JavaPrograms;
public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String name = "pavanKumarValajala";
		System.out.println(name.length());
		System.out.println(name.charAt(15));
		System.out.println(name.toUpperCase());
		String First_Name = "Pavan";
		String Last_Name = "Valajala";
		String First_Name1 = "Hazarath Shaik";
		String Last_Name1 = "Automation Testing";
		System.out.println(First_Name.concat(" ").concat(Last_Name));
		System.out.println(First_Name1.concat(" ").concat(Last_Name1));
		System.out.println(First_Name.contains(First_Name));
		String Title_of_the_page = "            Where we studing the Automation Course in bangolore              ";
		System.out.println(Title_of_the_page.trim());
	}

}
