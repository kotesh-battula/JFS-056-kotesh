package Interface;
public class Koti 
{
	public static void main(String[] args)
	{
		Lambda l=(a,b)-> {
			System.out.println(a+b);
		};
		l.add(10,30);
	}
}