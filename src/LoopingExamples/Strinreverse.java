package LoopingExamples;
public class Strinreverse {
	public static void main(String[] args)
	{
		String[] s=new String[3];
		s[0]="kotesh";
		s[1]="Battula";
		s[2]="Student";
		int k=s.length-1;
		for(int i=k;i>=0;i--)
		{
			int l=s[i].length()-1;
			for(int j=l;j>=0;j--)
			{
				System.out.print(s[i].charAt(j));
			}
			System.out.println();
		}
	}
}
