package Sample;

public class Basic {
	int rno;
	String name;
	public static void main(String[] args)
	{
		Basic b1=new Basic();
		Basic b2=new Basic();
		b1.rno=21;
		b2.rno=7;
		b1.name="Kotesh";
		b2.name="Sravani";
		System.out.println(b1.rno+" "+b1.name);
		System.out.println(b2.rno+" "+b2.name);
	}
}
