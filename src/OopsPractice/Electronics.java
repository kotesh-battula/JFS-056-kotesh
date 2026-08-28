package OopsPractice;

public class Electronics {
	int mobileid;
	String brand;
	String model;
	long price;
	Electronics()
	{
		mobileid=1;
		brand="new";
		model="acco";
		price=67000;
	}
	Electronics(int i,String b,String m,long l)
	{
		mobileid=i;
		brand=b;
		model=m;
		price=l;
	}
	Electronics(Electronics e)
	{
		mobileid=e.mobileid;
		brand=e.brand;
		model=e.model;
		price=e.price;
	}
	void display()
	{
		System.out.println("MobileID: "+mobileid);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args)
	{
		Electronics e1=new Electronics();
		System.out.println("Mobile 1 details");
		e1.display();
		Electronics e2=new Electronics(2,"One Plus","Nord CE 5",27000);
		
		System.out.println("Mobile 2 details");
		
		e2.display();
		Electronics e3=new Electronics(e2);
		System.out.println("Mobile 3 details");
		
		e3.display();
		System.out.println("After updating the price of moile 3");
		e3.price=20000;
		
		e2.display();
		e3.display();
		
	}
}
