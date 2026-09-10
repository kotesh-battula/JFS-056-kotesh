package DSA;
public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,7,5,32,6,8};
		int target=5;
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				ans=mid;
				right=mid-1;
			}
			else if(target<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		System.out.print(ans);
		
	}
}
