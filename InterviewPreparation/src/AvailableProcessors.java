import static java.lang.System.*;
public class AvailableProcessors {

	public static void main(String[] args)
	{
		Runtime runtime = Runtime.getRuntime();
		int availableProcessors = runtime.availableProcessors();
		System.out.println(availableProcessors);
	}
}
