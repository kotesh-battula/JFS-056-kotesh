package Sample;
import java.util.Scanner;
public class Caluculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number");
		int num1=sc.nextInt();
		System.out.print("Enter second number");
		int num2=sc.nextInt();
		System.out.print("Enter operator");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':System.out.print(num1+num2);break;
		case '-':System.out.print(num1-num2);break;
		case '*':System.out.print(num1*num2);break;
		case '/':System.out.print(num1/num2);break;
		case '%':System.out.print(num1%num2);break;
		default:System.out.print("Inavlid input");
		}
	}
}
