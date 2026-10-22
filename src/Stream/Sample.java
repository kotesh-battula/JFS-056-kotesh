package Stream;

public class Sample {
	synchronized public void one()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==3)
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	synchronized public void two()
	{
		for(int i=6;i<=10;i++)
		{
			System.out.println(i);
			if(i==7)
				notify();
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Sample s=new Sample();
		Thread t1=new Thread(()->s.one());
		Thread t2=new Thread(()->s.two());
		t1.start();
		t1.join();
		t2.start();
	}
}
