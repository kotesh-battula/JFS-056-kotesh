package OopsPractice;

public class Employee {
	int emp_id;
	String emp_name;
	static String company;
	static void display()
	{
		System.out.print("HI");
	}
	static
	{
		company="ABC solutions";
	}
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.emp_id=1;
		e.emp_name="kotesh";
		
		Employee e2=new Employee();
		e2.emp_id=2;
		e.emp_name="balu";
		
		display();
		
		System.out.println(e.emp_id+" "+e.emp_name+" "+company);
		System.out.println(e2.emp_id+" "+e2.emp_name+" "+company);
	}
}
