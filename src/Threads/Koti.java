package Threads;
import java.util.*;
public class Koti extends Thread{
	public void display()
	{
		System.out.println("This is Display Method");
	}
	public void show()
	{
		System.out.println("This is Show Method");
	}
	public void run()
	{
		display();
		show();
	}
	public static void main(String[] args)
	{
		Koti k1=new Koti();
		Koti k2=new Koti();
		k1.start();
		try {
		Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		k2.start();
	}
}
