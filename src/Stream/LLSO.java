package Stream;
import java.util.*;
public class LLSO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<>();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			ll.add(sc.nextInt());
		}
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
	}
}
