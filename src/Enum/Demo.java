package Enum;

public class Demo {
	enum Day
	{
		Tuesday,Thursday,Saturday;
		
	}
	public static void main(String[] args)
	{
		String s="Saturday";
		Day k=Day.valueOf(s);
		System.out.println(k);
		
	}
}
