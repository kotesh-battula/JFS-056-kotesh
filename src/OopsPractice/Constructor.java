package OopsPractice;

public class Constructor {
	int age;
	String name;
	Constructor(int a,String n)
	{
		age=a;
		name=n;
	}
	Constructor(Constructor c)
	{
		age=c.age;
		name=c.name;
	}
	void display()
	{
		System.out.print("My Name is "+name+" and age is "+age);	
		System.out.println();
	}
	public static void main(String[] args)
	{
		Constructor c=new Constructor(21,"kotesh");
		c.display();
		Constructor c1=new Constructor(c);
		c1.display();
	}
}