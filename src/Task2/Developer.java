package Task2;

public class Developer extends Employee {
	private String program;
	private String projectname;
	public Developer(int empid,String empname,int salary,String program,String projectname)
	{
		super(empid,empname,salary);
		this.program=program;
		this.projectname=projectname;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public void setProjectName(String projectname)
	{
		this.projectname=projectname;
	}
	public String getProgram()
	{
		return program;
	}
	public String getProjectName()
	{
		return projectname;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language: "+program);
		System.out.println("Project name: "+projectname);
	}
}
