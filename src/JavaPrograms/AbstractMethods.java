package JavaPrograms;
class GrandParent
{
	void us_auth()
	{
		System.out.println("ThankYou Authenication");
	}
	void us_as_auth() 
	{
		System.out.println("Sorry Authenication");
	}
}
abstract class parent extends GrandParent
{
	abstract void Us_e_mobileNumber();
	abstract void Us_e_mail();	
	void us_Auth()
	{
		System.out.println("Auth");
	}
	void us_Auth1()
	{
		System.out.println("Auth1");
	}
}
public abstract class AbstractMethods extends parent
{
	void number() 
	{
		System.out.println("9550075286");
	}
	void Id() 
	{
		System.out.println("Hazarath@123");
	}
	public static void main(String[] args)
	{
		AbstractMethods Am = new AbstractMethods() 
		{   
			@Override
			void Us_e_mail()
			{    
				System.out.println("hazarathshaik286@gmail.com");			
			}
			@Override
			void Us_e_mobileNumber()
			{
				System.out.println("9550075286425");		
			}
		};
		Am.us_auth();
		Am.us_as_auth();
		Am.us_Auth();
		Am.us_Auth1();
		Am.number();
		Am.Id();
		Am.Us_e_mail();
		Am.Us_e_mobileNumber();		
	}
}
