package Sample;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Veg Biryani \n2.Pizza \n3.Chicken DumBiryani \n4.Burger \n5.Exit");
		int option=sc.nextInt();
		switch(option)
		{
		case 1->System.out.println("Veg Biryani is 170");
		case 2->System.out.println("Pizza is 250");
		case 3->System.out.println("Chicken DumBiryani is 300");
		case 4->System.out.println("Burger is 350");
		case 5->System.out.println("exit");
		default->System.out.println("Enter valid Option");
		}
	}
}
