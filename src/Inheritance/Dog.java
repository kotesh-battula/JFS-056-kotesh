package Inheritance;

public class Dog extends Animal {
	
	String name="Tiger";
	public Dog()
	{
		super();
		System.out.println("Dog constructor");
	}
	@Override
	void makeSound()
	{
		System.out.println("HIIIII....");
	}
	void display()
	{
		System.out.println("HI THIS IS SUPERSTAR"+name);
		System.out.println(super.name);
		makeSound();
		super.makeSound();
	}
}
