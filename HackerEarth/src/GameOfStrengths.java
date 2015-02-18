import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class GameOfStrengths {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long mod = 1000000007;
		for(int i=0;i<testCases;i++)
		{
			int size = Integer.parseInt(br.readLine());
			long []array = new long[size];
			String[] elements = br.readLine().split(" ");
			for(int j=0;j<size;j++)
			{
				array[j] = Integer.parseInt(elements[j]);
				//System.out.println(array[i]);
			}
			long sum = 0;
			for(int j=0;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					//System.out.println(array[j] + "   " + array[k]);
					if(array[j] > array[k])
					{
						sum  = sum + (array[j]-array[k]); 
					}
					if(array[k] > array[j])
					{
						sum = sum + (array[k] - array[j]);
					}
					//System.out.println(sum);
				}
			}
			Arrays.sort(array);
			System.out.println((sum*array[size-1])%mod);
		}
	}
}
