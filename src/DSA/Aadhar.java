package DSA;

public class Aadhar {
	private long number;
	private String name;
	private int age;
	public void setNumber(long number)
	{
		this.number=number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public long setNumber()
	{
		return number;
	}
	public String getName()
	{
		return name;
    }
	public int getAge()
	{
		return age;
    }
	public long getNumber()
	{
		return number;
	}
	public static void main(String[] args)
	{
		Aadhar a=new Aadhar();
		a.setNumber(402504);
		a.setName("Kotesh");
		a.setAge(21);
		System.out.println(a.getNumber());
		System.out.println(a.getName());
		System.out.println(a.getAge());
	}
}
