package Polymorphism;
import java.util.Scanner;
public class Online {
	public int productId;
	String productName;
	int price;
	boolean is;
	Online(int productId,String productName)
	{
		this.productId=productId;
		this.productName=productName;
		System.out.println("Id is "+this.productId+" Name is "+this.productName);
	}
	Online(int productId,String productName,int price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		System.out.println("Id is "+this.productId+" Name is "+this.productName+" Price is "+this.price);
	}
	Online(int productId,String productName,int price,boolean isAvailable)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.is=is;
		System.out.println("Id is "+this.productId+" Name is "+this.productName+" Price is "+this.price+" is Available ? "+isAvailable);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String name=sc.next();
		int price=sc.nextInt();
		boolean is=sc.nextBoolean();
		Online o=new Online(a,name);
		Online o1=new Online(a,name,price);
		Online o2=new Online(a,name,price,is);
	}
 
}
