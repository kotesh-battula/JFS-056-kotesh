package Interface;

public class User {
	public static void takephoto(Camera cam)
	{
		cam.click();
	}
	public static void main(String[] args)
	{
		Camera cam=new Oneplus();
		cam.click();
		takephoto(cam);
	}
}
