package DSA;

public class insertPosition {
	public static void main(String[] args)
	{
		
		int[] arr= {7,4,8,6,3,6,4,7,7};
		int left=0;
		int right=arr.length-1;
		int target=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
		   if(arr[mid]<target)
		   {
			  left=mid+1;
		   }
		   else
		   {
			  right=mid-1;
		   }
	   }
		System.out.print(left);
	}
}
