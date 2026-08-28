package Interface;

public class User {
	public static void takephoto(Camera cam)
	{
		cam.click();
	}
	public static void main(String[] args)
	{
		Oneplus cam=new Oneplus();
		cam.playMusic();
	}
}
