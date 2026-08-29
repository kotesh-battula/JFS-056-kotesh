package Enum;

public class Demo {
	enum Day
	{
		Tuesday,Thursday,Saturday;
		public String toString()
		{
			return "This is"+name();
		}
	}
	public static void main(String[] args)
	{
		String s="Saturday";
		Day k=Day.valueOf(s);
		System.out.println(k.getClass().getName());
		System.out.println(Day.toString());
		
	}
}
