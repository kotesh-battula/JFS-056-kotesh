package Enum;
enum Dem{
	KOTESH,
	RAJESH,
	BALU,
	SIVA;
	static int id;
}
public class StaticDemo {
	public static void main(String[] args)
	{
		Dem.id=20;
		System.out.println(Dem.id);
		Dem d=Dem.RAJESH;
		System.out.println(d.id);
	}
}
