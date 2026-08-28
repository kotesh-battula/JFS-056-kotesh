package mypack2;

public class Sample {
	int money;
	public Sample(int money,int age)
	{
		this.money=money;
		System.out.println("Hellooooooo");
	}
	public Sample()
	{
		System.out.println(this.money);
	}
	 
	public static void main(String[] args)
	{
		Sample s=new Sample(20,29);
		Sample s1=new Sample();
		System.out.println(s.money);
	}
}
