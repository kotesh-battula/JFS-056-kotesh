package Threads;
import java.util.*;
public class Synchro {
	synchronized void display()
	{
		System.out.println("Hi namasthe");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thanks for resuming");
	}
	synchronized void show()
	{
		notify();
		System.out.println("Show method");
		System.out.println("Show method second");
		System.out.println("Third show method");
	}
	public static void main(String[] args)
	{
		Synchro s=new Synchro();
		Thread t1=new Thread(()->s.display());
		Thread t2=new Thread(()->s.show());
		t1.start();
		t2.start();
		
	}
}
