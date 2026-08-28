package Exception;

public class MultiCatches {

	public static void main(String[] args) {
		int n=1;
		int num=9;
		String s=null;
		try
		{
			switch(n) {
			//case 1:System.out.println(num/0);
			//break;
			case 1:System.out.println(s.length());
			break;
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
