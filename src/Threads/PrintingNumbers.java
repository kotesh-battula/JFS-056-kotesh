package Threads;

public class PrintingNumbers extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==2) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingNumbers p1=new PrintingNumbers();
		p1.start();
		System.out.println("Executed by "+Thread.currentThread().getName());
	}

}
