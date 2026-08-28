package OopsPractice;

public class Student {
	String name;
	static int roll_no;
	float percentage;
	
	static
	{
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	{
		System.out.println("kotesh");
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="kotesh battula";
		roll_no=21;
		s1.percentage=95.4f;
		
		Student s2=new Student();
		s2.name="Balu battula";
		roll_no=26;
		s2.percentage=97.2f;
		
		System.out.println(s1.name+" "+roll_no+" "+s1.percentage);
		System.out.println(s2.name+" "+roll_no+" "+s2.percentage);
	}
}
