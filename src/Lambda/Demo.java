package Lambda;

interface Demo1 {
	abstract public void show(int a);
}
public class Demo
{
	public static void main(String[] args)
	{
		Demo1 d=((a)->System.out.println("Show method"+a));
		d.show(7);
	}
}
