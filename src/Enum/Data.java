package Enum;
enum Role{
	DEVELOPER(50000, "IT"),
	TESTER(40000, "QA"),
	MANAGER(70000, "MANAGEMENT"),
	HR(45000, "HR");
	private int salary;
	private String dept;
	Role(int salary,String dept)
	{
		this.salary=salary;
		this.dept=dept;
	}
	public int getSalary()
	{
		return salary;
	}
	public String getDept()
	{
		return dept;
	}
	public String toString()
	{
		return salary+" "+dept;
	}
	 
}
public class Data {
	public static void main(String[] args)
	{
		for(Role r:Role.values())
		{
			System.out.println(r);
		}
	}
}
