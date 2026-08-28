package Threads;

public class Worker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->{
			for(int i=1;i<=3;i++)
			{
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		},"Koti");
		Thread t2=new Thread(()->{
			for(int i=4;i<=6;i++)
			{
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		},"Battula");
		t1.start();
		t1.join();
		t2.start();
		
		t2.join();
		System.out.println(Thread.currentThread().getName());

	}

}
