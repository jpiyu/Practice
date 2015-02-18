import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LongestIncreasingSubsequence {
	static String[] str;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			try
			{
				str = br.readLine().split(" ");
			}catch(Exception e)
			{

			}
			int length = str.length;
			int arr[] = new int[length];
			for(int i=0;i<length;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			int lis[] = new int[length];
			for(int i=0;i<length;i++)
			{
				lis[i] = 1;
			}
			for(int i=1;i<length;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(arr[i] > arr[j] && lis[i] < lis[j]+1)
					{
						lis[i] = lis[j]+1;
					}
				}
			}
			Arrays.sort(lis);
			int seq_len = lis[length-1];
			//System.out.println(seq_len);
			System.out.println(Integer.toBinaryString(seq_len));
			testCases--;
		}
	}
}
