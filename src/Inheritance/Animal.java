package Inheritance;

public class Animal {
	String name="Lion";
	Animal()
	{
		System.out.println("Animal constrcutor");
	}
	void makeSound()
	{
		System.out.println("It is animal sound");
		System.out.println(getClass().getSuperclass());
	}
}
