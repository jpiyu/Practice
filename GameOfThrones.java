import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class GameOfThrones {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of testCase");
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			int day = Integer.parseInt(br.readLine());
			int curDay = 1;
			while(curDay != day)
			{
				int j = curDay;
				while(j > 0)
				{
					curDay++;
				}
			}
			testCases--;
		}
	}
}
