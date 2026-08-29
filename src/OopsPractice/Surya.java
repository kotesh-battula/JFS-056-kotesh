package OopsPractice;
import java.util.Scanner;
public class Surya {
	static int m1;
	int m2;
	void show()
	{
		System.out.println(m1+m2);
	}
	static {
		System.out.println("HIII");
	}
	{
		System.out.println("KOtesh");
	}
	public String toString()
	{
		return m1+" "+m2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surya s1=new Surya();
		Surya s2=new Surya();
		s1.m1=21;
		s1.m2=30;
		s1.show();
		s2.m1=20;
		s2.m2=50;
		
		s2.show();

	}

}
