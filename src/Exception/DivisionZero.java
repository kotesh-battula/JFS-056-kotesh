package Exception;

public class DivisionZero {
	public static int test()
	{
		try
		{
			System.out.println("It is try block");
			return 1;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
			return 2;
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
	public static void main(String[] args)
	{
		/*
		 * int a=10; int b=0; int res=0; String s=null; try {
		 * //System.out.println(s.length()); res=a/b; } catch(Exception e) {
		 * //e.printStackTrace(); System.out.println(e.getMessage());
		 * System.out.println("Not divisible by zero"); } finally {
		 * System.out.println("Exception resolved"); } System.out.println(res);
		 */
		test();
	}
}
