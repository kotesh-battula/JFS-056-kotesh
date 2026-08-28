package OopsPractice;

public class Payroll {
	int empid;
	String empname;
	String dept;
	long salary;
	Payroll(int i,String s,String d,long l)
	{
		empid=i;
		empname=s;
		dept=d;
		salary=l;
	}
	void display()
	{
		System.out.println("EMP_ID: "+empid);
		System.out.println("EMP_NAME: "+empname);
		System.out.println("DEPARTMENT: "+dept);
		System.out.println("SALARY: "+salary);
	}
	public static void main(String[] args)
	{
		Payroll p1=new Payroll(1,"Koti","ADMIN",50000);
		Payroll p2=new Payroll(2,"Balu","Developer",70000);
		Payroll p3=new Payroll(3,"Ashok","DATABASE",80000);
		p1.display();
		p2.display();
		p3.display();
	}

}
