package mypack1;
import java.util.*;
public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=--a + ++a;
	    int c=b+a++ + b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(++b);
	}
}
