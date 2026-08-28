package DSA;
import java.util.Scanner;
public class Movie {
	private int price;
	private String moviename;
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setMovieName(String moviename)
	{
		this.moviename=moviename;
	}
	public int getPrice()
	{
		return price;
	}
	public String getMovieName()
	{
		return moviename;
	}
	public static void main(String[] args)
	{
		Movie m=new Movie();
		m.setPrice(149);
		m.setMovieName("Okkadu");
		System.out.println(m.getPrice());
		System.out.println(m.getMovieName());
	}
}
