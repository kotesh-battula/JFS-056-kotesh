package OopsPractice;

public class Copy {
	String brand;
	String model;
	long price;
	{
		System.out.println("Laptop Details:");
	}
	Copy(String s1,String s2,long l)
	{
		brand=s1;
		model=s2;
		price=l;
	}
	Copy(Copy a)
	{
		brand=a.brand;
		model=a.model;
		price=a.price;
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args)
	{
		Copy c=new Copy("Dell","Inspiron 15",62000);
		c.display();
		Copy c1=new Copy(c);
		c1.display();
	}
	

}
