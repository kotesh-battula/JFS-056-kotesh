package Constructor;

public class Online {
	Online(int oid)
	{
		System.out.println("Id :"+oid);
	}
	Online(int oid,String name)
	{
		this(oid);
		System.out.println("Name :"+name);
	}
	Online(int oid,String name,String item)
	{
		this(oid,name);
		System.out.println("Item :"+item);
	}
	Online(int oid,String name,String item,String address)
	{
		this(oid,name,item);
		System.out.println("Address :"+address);
	}
	public static void main(String[] args)
	{
		Online o=new Online(1,"Mehfil","Biryani","Addagutta");
	}
}
