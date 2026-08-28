package Arrays;
import java.util.Optional;
public class OptionalDemo {
	public static void main(String[] args)
	{
		String name="Kotesh";
		Optional<String> op=Optional.of(name);
		Optional<String> op1=Optional.ofNullable(name);
		System.out.println(op1);
	}
}
