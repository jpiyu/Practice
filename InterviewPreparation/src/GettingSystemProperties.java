import static java.lang.System.*;
import java.util.*;
public class GettingSystemProperties {
	public static void main(String[] args)
	{
		Properties properties = System.getProperties();
		properties.list(System.out);
	}
}
