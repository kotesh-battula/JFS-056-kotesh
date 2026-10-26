package Preparation;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer s1=new StringBuffer(s).reverse();
		System.out.println(s1);
	}

}
