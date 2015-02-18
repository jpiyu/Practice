import static java.lang.System.*;

public class GettingOSName {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println(osName);
	}

}
