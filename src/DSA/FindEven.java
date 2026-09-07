package DSA;
import java.util.*;
public class FindEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,5,35,7,52,6,8};
		for(int nu:arr)
		{
			if(nu%2==0)
			{
				System.out.println("Found even number: "+nu);
				return;
			}
		}
	}

}
