package Task;
public class Surgeon extends Hospital {
	private String surgeryType;
	private int yearsOfExperience;
	public Surgeon(int doctorId,String doctorName,String specialization,String surgeryType,int yearsOfExperience)
	{
		super(doctorId,doctorName,specialization);
		this.surgeryType=surgeryType;
		this.yearsOfExperience=yearsOfExperience;
	}
	public String getSurgeryType()
	{
		return surgeryType;
	}
	public int getYearsOfExperience()
	{
		return yearsOfExperience;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Surgeon Type is "+surgeryType);
		System.out.println("Years of Experience is "+yearsOfExperience);
	}
}
