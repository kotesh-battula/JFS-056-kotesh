package Threads;

public class SetName extends Thread {
	public SetName(String s)
	{
		super(s);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetName s=new SetName("Kotesh Thread");
		s.start();
	}

}
