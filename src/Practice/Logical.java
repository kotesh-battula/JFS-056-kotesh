package Practice;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		
		if(a>5 && b>10)             // && is logical operator like 'AND'   MEANS both condition must be true
		{
			System.out.println("Hmmm");
		}
		else
		{
			System.out.println("both conditions are not true");
		}
		
		if(a>20 || b>10)             // || is logical operator like 'OR'   MEANS atleast one condition must be true
		{
			System.out.println("Hmmm");
		}
		else
		{
			System.out.println("not evem one condition is not true");
		}
		
		boolean res=false;
		
		if(!res)                     // ! is not , means it will change the boolean value true into false and false into true
		{
			System.out.println("Mmm");
		}
	}

}
