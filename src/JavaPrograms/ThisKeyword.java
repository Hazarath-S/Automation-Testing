package JavaPrograms;
public class ThisKeyword 
{
	int age;
	String name;
	String Location;
	double Salary;
	 ThisKeyword (int age,String name,String Location,double Salary)
	{
		 
	//System.out.print(" The Employee of the age is :"+ age + " The Employee of the name is :"+ name
	 // 	+" The Employee of the Location is : "+ Location + " The Employee of the Salary is :"+ Salary);
		
		this.age = age;
		this.name = name;
		this.Location= Location;
		this.Salary = Salary;
	} 
	  public String  toString () 
	  {	 
		return  " Location : "  +Location +"\n"+ " age : " +age + "\n"+ " name : " + name + "\n"+" Salary : "+ Salary ;		  
	  }
	   public static void main(String[] args) 
	{
		   ThisKeyword T1 = new ThisKeyword(20,"Ramu","Hyderabad",2500.02);	
		 
		   System.out.print(T1);
    }
}