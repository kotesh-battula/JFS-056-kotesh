package FileHandling;
import java.io.IOException;
import java.io.*;
public class FileCreate {
	public static void main(String[] args) throws IOException
	{
		File f=new File("Kotesh.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Name:Kotesh\n");
		fw.write("Number:7671923128");
		fw.close();
		FileReader fr=new FileReader(f);
		int data;
		while((data=fr.read())!=-1)
		{
			System.out.print((char)data);
		}
		fr.close();
		System.out.println("FIle location: "+f.getAbsolutePath());
	}
}
