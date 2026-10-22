package Stream;

interface koti{
	public void add();
	public void sub();
}
public class FI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		koti k=new koti(){
			@Override
			public void add()
			{
				System.out.println("This is add method");
			}
			public void sub()
			{
				System.out.println("This is sub method");
			}
		};
		k.add();
	}

}
