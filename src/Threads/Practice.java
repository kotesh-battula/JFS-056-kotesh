package Threads;
import java.util.*;
public class Practice extends Thread{
	public void run()
	{
	    System.out.println("Before sleep: "
	            + Thread.currentThread().getState());

	    try
	    {
	        Thread.sleep(1000);
	        System.out.println(Thread.currentThread().getState());
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }

	    System.out.println("After sleep: "
	            + Thread.currentThread().getState());
	}
	public static void main(String[] args)
	{
		Practice p1=new Practice();
		Practice p2=new Practice();
		p1.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		p2.start();
		
	}
}
