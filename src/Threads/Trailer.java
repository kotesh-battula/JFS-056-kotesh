package Threads;

public class Trailer{
	public void show()
	{
		System.out.println("HIII this is Kotesh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trailer t=new Trailer();
		Thread t1=new Thread(()->t.show());
		t1.start();
	}

}
