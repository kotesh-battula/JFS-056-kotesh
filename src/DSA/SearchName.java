package DSA;
import java.util.*;
public class SearchName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] arr= {"Kotesh","Siva","rajesh","ashok","Balu"};
		String target=sc.next();
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(target.toUpperCase()))
			{
				index=i;
			}
		}
		System.out.print(index!=-1?"Found at index: "+index:"Not found");
		
	}

}
