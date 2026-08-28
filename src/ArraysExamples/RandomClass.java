package ArraysExamples;
import java.util.Random;
public class RandomClass{
	public static void main(String[] args)
	{
		Random rm=new Random();
		int val=rm.nextInt(21);
		System.out.print(val+" "+rm.nextBoolean()+" "+rm.nextFloat());
	}
}
