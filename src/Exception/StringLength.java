package Exception;
import java.util.Scanner;
public class StringLength {
	public static void validatePassword(String s) 
	{
		if(s.length()<8)
		{
			throw new PasswordException("Password doesn't have 8 characters");
		}
		System.out.println("Account created successfully");
	}
	public static void main(String[] args) throws PasswordException
	{
		Scanner sc=new Scanner(System.in);
		String passwd=sc.nextLine();
		validatePassword(passwd);
	}
}
