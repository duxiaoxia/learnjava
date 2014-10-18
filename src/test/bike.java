package test;

public class bike {
  
	private String name;
	private String color;
	private String size;
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
	   this.name=name;	
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	public String getsize()
	{
		return size;
	}
	
	public void setsize(String size)
	{
		this.size=size;
	}
	
	public static void hah()
	{
		System.out.println("Bike");
	}
}

class superbike extends bike
{
   private double price;   
	
   public void setprice(double price)
   {
	   this.price=price;
   }
   
   public double getprice()
   {
	   return price;
   }
   
   public static void hah()
   {
	   System.out.println("SuperBike");
   }
}
