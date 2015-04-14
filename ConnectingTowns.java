import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ConnectingTowns {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long mod = 1234567;
		while(testCases > 0)
		{
			int numberOfTowns = Integer.parseInt(br.readLine());
			String[] routes = br.readLine().split(" ");
			long[] arr = new long[routes.length];
			long result = 1;
			long modResult = 0;
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = Long.parseLong(routes[i]);
			}
			for(int i=0;i<arr.length;i++)
			{
				result = (result * arr[i]);
				modResult = (result%mod);
				//System.out.println(result + "   " + modResult);
			}
			System.out.println(modResult);
			testCases--;
		}
	}
}
