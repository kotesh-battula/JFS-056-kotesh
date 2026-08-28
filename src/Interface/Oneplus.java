package Interface;

public class Oneplus implements Camera,Music {
	@Override
	public void click()
	{
		System.out.println("I take photo in one plus");
	}
	@Override
	public void playMusic()
	{
		System.out.println("Playing music in oneplus");
	}

}
