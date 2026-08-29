package Threads;

public class Numbers extends Thread{
	public void display()
	{
		for(int i=1;i<=5;i++)
		System.out.println(i+" "+Thread.currentThread().getName());
	}
	public void show()
	{
		System.out.println("HII namastye this is kotesh and thread name is "+Thread.currentThread().getName());
	}
	public static void main(String[] args) throws InterruptedException
	{
		Numbers n=new Numbers();
		Thread t=new Thread(()->{
			n.display();
		},"First Thread");
		Thread t1=new Thread(()->{
			n.show();
		},"Second thread");
		t.start();
		t.join();
		t1.start();
		t1.join();
		System.out.println("Program finished");
	}
}
