import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LadderRide {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long testCases = Long.parseLong(str[0]);
		int totalSteps = Integer.parseInt(str[1]);
		while(testCases > 0)
		{
			String[] string = br.readLine().split(" ");
			int curr = Integer.parseInt(string[0]);
			int k = Integer.parseInt(string[1]);
			long[] result = new long[totalSteps];
			long mod = 1000000007;
			result[0] = 0;
			result[1] = 0;
			result[2] = 1;
			result[3] = 0;
			result[4] = 1;
			result[5] = 1;
			for(int i=6;i<k;i++)
			{
				result[i] = (result[i-2] + result[i-5])%mod;
			}
			result[k] = (result[k-2] + result[k - 5] + 1)%mod;
			for(int i=k+1;i<totalSteps;i++)
			{
				result[i] = (result[i-2] + result[i-5] + result[i - k])%mod;
			}
			System.out.println(result[curr]);
			testCases--;
		}
	}
}
