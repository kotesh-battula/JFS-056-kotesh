package Task;

public class Hospital {
	private int doctorId;
	private String doctorName;
	private String specialization;
	public Hospital(int doctorId,String doctorName,String specialization)
	{
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.specialization=specialization;
	}
	public int getDoctorId()
	{
		return doctorId;
	}
	public String getDoctorName()
	{
		return doctorName;
	}
	public String getSpecialization()
	{
		return specialization;
	}
	public void displayDetails()
	{
		System.out.println("Doctor Id is "+doctorId);
		System.out.println("Doctor Name is "+doctorName);
		System.out.println("Doctor specialization is "+specialization);
	}
}

