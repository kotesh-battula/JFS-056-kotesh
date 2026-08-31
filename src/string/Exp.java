package string;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java Programming";
		String s2="java";
		s2=s2+" Programming";
		String s3=new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
