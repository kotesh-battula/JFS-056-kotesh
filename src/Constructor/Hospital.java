package Constructor;

public class Hospital {
	
	static
	{
		System.out.println("Patient Details :");
	}
	Hospital(int patientid)
	{
	
		System.out.println("Patient id is : "+patientid);
	}
	Hospital(int patientid,String name)
	{
		this(patientid);
		System.out.println("Name is created: "+name);
	}
	Hospital(int patientid,String name,String disease)
	{
		this(patientid,name);
		System.out.println("Disease is: "+disease);
	}
	Hospital(int patientid,String name,String disease,long price)
	{
		this(patientid,name,disease);
		System.out.println("Price is: "+price);
	}
	public static void main(String[] args)
	{
		Hospital h=new Hospital(101,"Soori","Diabetes",80000);
	}

}
