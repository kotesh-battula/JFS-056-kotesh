package Enum;
import java.util.*;
enum UPI{
	CASH(0.0,"No extra change"),
	CARD(2.0,"Card Payment"),
	UPI(0.0,"UPI Payment"),
	NET_BANKING(1.5,"Internet Banking");
	double val;
	String desc;
	UPI(double val,String desc)
	{
		this.val=val;
		this.desc=desc;
	}
	public double getVal()
	{
		return val;
	}
	public String getDesc()
	{
		return desc;
	}
	public void display()
	{
		System.out.println("Payment Method: "+name());
		System.out.println("Fee: "+val);
		System.out.println("Description: "+desc);
	}
}
public class Payment {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toUpperCase();
		UPI u1=UPI.valueOf(s);
		u1.display();
	}
}
