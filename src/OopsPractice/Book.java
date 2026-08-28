package OopsPractice;

public class Book {
	int bookid;
	String title;
	String author;
	float price;
	Book()
	{
		bookid=1;
		title="JAVA PROGRAMMING";
		author="JOS GASLING";
		price=89f;
	}
	void display()
	{
		System.out.println("BookID: "+bookid);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args)
	{
		Book b1=new Book();
		b1.display();
	}
}
