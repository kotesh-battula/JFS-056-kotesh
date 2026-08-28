package Task2;

public class Employee {
	private int empid;
	private String empname;
	private int salary;
	public Employee(int empid,String empname,int salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	public void setEmpId(int empid)
	{
		this.empid=empid;
	}
	public void setEmpName(String empname)
	{
		this.empname=empname;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getEmpId()
	{
		return empid;
	}
	public String getEmpName()
	{
		return empname;
	}
	public int getSalary()
	{
		return salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Salary: "+salary);
	}
}
