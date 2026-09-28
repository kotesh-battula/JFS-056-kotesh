package Threads;

public class Deadlock {
	public void display()
	{
		show();
	}
	public void show()
	{
		display();
	}
	public static void main(String[] args)
	{
		Deadlock d=new Deadlock();
		d.display();
	}
}
