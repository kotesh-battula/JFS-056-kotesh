package Threads;

public class Second {
	public static void main(String[] args)
	{
		Thread t=new Thread(()->{
			for(int i=0;i<11;i++)
			{
				System.out.print(i+" ");
			}
		});
		t.start();
		System.out.print(Thread.currentThread().getName());
	}
}
