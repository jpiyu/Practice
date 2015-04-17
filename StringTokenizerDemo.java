import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class StringTokenizerDemo {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
