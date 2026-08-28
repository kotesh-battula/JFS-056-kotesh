package ArraysExamples;
import java.util.Scanner;
public class JaggedArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of rows: ");
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter no.of columns in "+i+"th row: ");
			int col=sc.nextInt();
			arr[i]=new int[col];
			System.out.print("Enter values");
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
