package FileHandling;
import java.io.*;
import java.util.Scanner;
public class FileScanner {
	public static void main(String[] args) throws IOException
	{
		File f=new File("Sample.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Hi namasthe\n");
		fw.write("This is kotesh\n how are you guys??");
		fw.close();
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
	}
}
