package Threads;

public class Example {
	public static void main(String[] args)
	{
		Object obj=new Object();
		Thread t1=new Thread(()->{
			synchronized(obj)
			{
				System.out.println("Thread is running");
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("IT can resume");
			}
		});
		t1.start();
		synchronized(obj)
		{
			obj.notify();
		}
		try {
		t1.join();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Finish");
	}
}
