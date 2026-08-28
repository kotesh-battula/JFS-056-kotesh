package Abstraction;

public class Biryani extends Restaurant{
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
