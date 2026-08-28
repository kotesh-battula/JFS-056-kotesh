package Interface;

public class Samsung implements Camera ,Music {
	@Override
	public void click()
	{
		System.out.print("I take photo in Samsung");
	}
	@Override
	public void playMusic()
	{
		System.out.println("Playing music");
	}
}
