package Arrays;

public class Duplicates {
	public static void main(String[] args)
	{
		int[] arr= {1,4,2,5,7,4,3,6,8,4,3};
		for(int i=0;i<arr.length;i++)
		{
			boolean res=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					res=true;
				}
			}
			if(res)
				continue;
			for(int k=i+1;k<arr.length;k++)
			{
				if(arr[k]==arr[i]) {
				System.out.print(arr[i]+" ");
				break;
				}
			}
		}
	}
}
