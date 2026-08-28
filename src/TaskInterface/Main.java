package TaskInterface;
import java.util.Scanner;
public class Main {
	 public static void one(Scanner sc,Payment p)
	 {
		 
		 int choice;
		 do
		 {
			System.out.println("1.Display Balance \n2.Add Money \n3.Withdraw Money \n4.Exit");
		    choice=sc.nextInt();
		    switch(choice)
		    {
		       case 1:p.showBalance();break;
		       case 2:System.out.println("Enter Money to add ");
		              int m=sc.nextInt();
		              System.out.println(p.addMoney(m));break;
		       case 3:System.out.println("Enter money to withdraw ");
		              int a=sc.nextInt();
		              System.out.println(p.withDraw(a));break;
		       case 4:System.out.println("Thanks for using ");return;
		       default:System.out.println("Enter Valid Option");
		   }
		 }while(choice!=4);
	 }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		System.out.println("Enter Type of Payment Among below options:");
		System.out.println("1.Credit \n2.Netbanking \n3.Paypal \n4.UPI");
		
		int option=sc.nextInt();
		Payment p;
		if(option==1)
		{
			p=new Credit(amount);
			one(sc,p);
		}
		else if(option==2)
		{
			p=new Netbanking(amount);
			one(sc,p);
		}
		else if(option==3)
		{
			p=new Paypal(amount);
			one(sc,p);
		}
		else if(option==4)
		{
			p=new UPI(amount);
			one(sc,p);
		}
		else
		{
			System.out.println("Enter valid choice");
		}
	 
	}
}
