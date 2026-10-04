package FileHandling;
import java.io.*;

public class Fileinput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("kotesh.jpg");
		FileOutputStream fw=new FileOutputStream("kotesh_copy.jpg");
		int data;
		while((data=f.read())!=-1) {
			fw.write(data);
		}
		f.close();
		fw.close();
		System.out.println("Copied Successfully");
	}
}
