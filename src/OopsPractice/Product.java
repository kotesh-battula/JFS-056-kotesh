package OopsPractice;

public class Product {
	int oid;
	String name;
	double price;
	
	Product(int oid)
	{
		this.oid=oid;
		System.out.println("Order is created"+oid);
	}
	Product(int oid,String name)
	{
		this(oid);
		this.name=name;
		System.out.println("Name is created: "+name);
	}
	Product(int oid,String name,double price)
	{
		this(oid,name);
		this.price=price;
		System.out.println("Order price: "+price);
	}
	public static void main(String[] args)
	{
		Product p=new Product(101,"Soap",39.0);
	}
}
