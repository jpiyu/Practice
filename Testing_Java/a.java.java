import static java.lang.System.*;
import java.io.*;
public class BufferedReaderDemo
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}

}
