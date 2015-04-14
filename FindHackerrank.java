import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class FindHackerrank {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String[] str = br.readLine().split(" ");
			if(str.length != 1 && str[0].equals("hackerrank"))
			{
				System.out.println("1");
				//continue;
			}
			else if(str.length != 1 && str[str.length-1].equals("hackerrank"))
			{
				System.out.println("2");
				//continue;
			}
			else if(str.length == 1 && str[0].equals("hackerrank"))
			{
				System.out.println("0");
				///continue;
			}
			else
			{
				System.out.println("-1");

			}
			testCases--;
		}
	}
}
