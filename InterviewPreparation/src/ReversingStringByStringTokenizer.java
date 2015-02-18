import java.io.*;
import java.util.StringTokenizer;

public class ReversingStringByStringTokenizer {
	public static void main(String[] args) throws IOException
	{
		System.out.println("enter a string that you want to reverse");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer stk = new StringTokenizer(str);
		String reverse ="";
		while(stk.hasMoreElements())
		{
			reverse = stk.nextToken() + " " + reverse;
		}
		System.out.println(reverse);
	}
}
