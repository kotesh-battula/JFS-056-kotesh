package Abstraction;

public class Bakery extends Restaurant{
	String name;
	String location;
	public void details(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	public void displayDetails()
	{
		System.out.println(name+" "+location);
	}
}
