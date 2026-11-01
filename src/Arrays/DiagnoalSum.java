package Arrays;

import java.util.Scanner;

public class DiagnoalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		int primary=0;
		int secondary=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				if(i==j)
				{
					primary+=arr[i][j];
				}
				if(i+j==col-1)
				{
					secondary+=arr[i][j];
				}
			}
		}
		System.out.println("Total: "+(primary+secondary));
	}

}
