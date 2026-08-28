package Threads;
import java.util.*;
public class Mode {
	public static void main(String[] args)
	{
		Object obj=new Object();
		Thread t1=new Thread(()->{
			System.out.println("Thread is running");
			try {
			obj.wait();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("After notifying");
		});
		t1.start();
		obj.notify();
	}
}
