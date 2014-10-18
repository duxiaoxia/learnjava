package test;

public class chinese extends person {
 
	chinese()
	{
		super();
		prt("A Chinese");
	}
	
	chinese(String name)
	{
		super();
		//System.out.println("his name is: " +name);
		prt("Chinese's name is : "+ name);
	}
	
	chinese(String name, int age)
	{
		this(name);
		prt("Chinese age's : "+ age);
	}
}
