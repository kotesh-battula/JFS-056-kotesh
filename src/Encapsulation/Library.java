package Encapsulation;
import java.util.Scanner;
public class Library {
	private int bookid;
	private int overdue;
	static int fine=10;
	public void setBookId(int bookid)
	{
		this.bookid=bookid;
	}
	public void setOverDue(int overdue)
	{
		this.overdue=overdue;
	}
	public int getBookId()
	{
		return bookid;
	}
	public int getOverDue()
	{
		return overdue;
	}
	public int fineByDays(int days)
	{
		if(days<10)
		return getOverDue()*5;
		else
			return getOverDue()*5+10;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int bookid=sc.nextInt();
		int overdue=sc.nextInt();
		int days=sc.nextInt();
		Library l=new Library();
		l.setBookId(bookid);
		l.setOverDue(overdue);
		l.fineByDays(days);
		System.out.println(l.fineByDays(days));
	}
}
