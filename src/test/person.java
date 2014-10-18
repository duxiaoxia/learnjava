package test;

public class person {

	person()
	{
		prt("Just a Person");
	}
	
	person(String name)
	{
		prt("Person's name is: "+ name);
	}
	
	public static void prt(String s){
		System.out.println(s);
	}
	
}
