package DSA;

public class Jagged {
	public static void main(String[] args)
	{
		int[][] a= {{2,3,5},{9,76},{6,89,65,33}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
