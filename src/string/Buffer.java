package string;
import java.util.Scanner;
public class Buffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		sb.append("Java");
		System.out.println(sb);
		System.out.println(sb.insert(0, "core "));
		System.out.println(sb);
	}

}
