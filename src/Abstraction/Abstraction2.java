package Abstraction;

public class Abstraction2 extends Abstract1{
	public void display()
	{
		System.out.print("Abstract 2 display method");
	}
	public static void main(String[] args)
	{
		Abstract1 k=new Abstraction2();
		k.display();
		k.show();
	}
}
