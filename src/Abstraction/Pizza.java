package Abstraction;

class Pizza extends Restaurant {
	String name;
	String location;
	void details(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	public void displayDetails()
	{
		System.out.println(name+" "+location);
	}
}
