import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class KnowingOSName {
	public static void main(String[] args)
	{
		String osName = System.getProperty("os.name");
		System.out.println(osName);
	}
}
