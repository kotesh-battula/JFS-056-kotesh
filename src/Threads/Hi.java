package Threads;

public class Hi extends Thread  {
	public void run()
	{
		System.out.println("Hello  from child Thread");
	}
	public static void main(String[] args)
	{
		Hi h=new Hi();
		h.start();
	}
}
