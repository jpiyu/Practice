import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ReadingAFileWithReader {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a file name");
		String name = br.readLine();
		FileReader fr = new FileReader(name);
		BufferedReader br2 = new BufferedReader(fr);
		String str = null;
		while((str = br2.readLine()) != null)
		{
			System.out.println(str);
		}
	}
}
