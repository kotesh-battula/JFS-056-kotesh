package DSA;
import java.util.*;
public class StringBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		String target=sc.next();
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				System.out.println("Found at "+mid);
				return;
			}
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
	}

}