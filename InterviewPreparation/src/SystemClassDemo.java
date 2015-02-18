import static java.lang.System.*;
import java.util.*;
public class SystemClassDemo {

	public static void main(String[] srgs)
	{
		String osName = System.getProperty("os.name");
		String javaVersion = System.getProperty("java.specification.version");
		String classPath = System.getProperty("java.class.path");
		String fileSeparator = System.getProperty("file.separator");
		
		System.out.println("Here are all the properties : " + osName + " " + javaVersion + " " + classPath + " " + fileSeparator);
		
		System.out.println("\n");
		
		System.out.println("we can also list all the properties by using the system class");
		
		Properties properties = System.getProperties();
		
		properties.list(System.out);
	}
}
