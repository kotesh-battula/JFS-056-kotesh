package Threads;

public class WaitPractice extends Thread {
	synchronized void message()
	{
		System.out.println("Thread name is "+Thread.currentThread().getName());
		try {
		wait();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Finish message method");
	}
	synchronized void call()
	{
		System.out.println("This is call method");
		notify();
		System.out.println("Call method finished");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitPractice w=new WaitPractice();
		Thread t1=new Thread(()->{
		w.message();
		},"Koti");
		t1.start();
		Thread t2=new Thread(()->w.call());
		t2.start();
	}

}
