package Enum;

enum Employee{
	Balu(1,"He is Brother"),
	Mahesh(2,"He is husband"),
	Suseela(3,"Its me");
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	
}
public class Kotesh {
	public static void main(String[] args)
	{
		Employee e1=Employee.Balu;
		for(Employee e:Employee.values())
		{
			System.out.println(e);
		}
		System.out.println(e1.id);
	}
}
