package Task2;

public class Tester extends Employee {
	private String testingtool;
	private String automationtype;
	public Tester(int empid,String empname,int salary,String testingtool,String automationtype)
	{
		super(empid,empname,salary);
		this.testingtool=testingtool;
		this.automationtype=automationtype;
	}
	public void setTestingTool(String testingtool)
	{
	this.testingtool=testingtool;
	}
	public void setAutomationType(String automationtype)
	{
		this.automationtype=automationtype;
	}
	public String gettestingTool()
	{
		return testingtool;
	}
	public String getAutomationType()
	{
		return automationtype;
	}
	public void displaydetails()
	{
		super.displayDetails();
		System.out.println("testing Tool: "+testingtool);
		System.out.println("Automation Type: "+automationtype);
	}
}
