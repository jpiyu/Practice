import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SortingStringArray {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(str);
		Object[] object = list.toArray();
		String[] strArray = Arrays.copyOf(object,object.length,String[].class);
		Arrays.sort(strArray);
		
		for(String str1 : strArray)
		{
			System.out.println(str1);
		}
	}
}
