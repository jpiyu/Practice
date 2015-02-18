import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SherlockAndArray {
	static String[] str;
	static int[][] array;
	static int testCases;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testCases = Integer.parseInt(br.readLine());
		int y = 0;
		array = new int[testCases][];
		int[] sizeOfArray = new int[testCases];
		boolean answer;
		String[] results = new String[testCases];
		while(y < testCases)
		{
			sizeOfArray[y] = Integer.parseInt(br.readLine());
			array[y] = new int[sizeOfArray[y]];
			String[] str = br.readLine().split(" ");
			for(int i=0;i<str.length;i++)
			{
				array[y][i] = Integer.parseInt(str[i]);
			}
			y++;
		}
		/*for(int i=0;i<testCases;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println(array[i][j]);
			}
		}*/
		for(int i=0;i<results.length;i++)
		{
			results[i] = "NO";
		}
		for(int i=0;i<testCases;i++)
		{
			//answer = true;
			for(int j=0;j<=(sizeOfArray[i]-1);j++)
			{
				answer = check(array[i],j);
				if(answer == true)
				{
					results[i] = "YES";
					break;
				}
				/*else
				{
					results[i] = "NO";
					break;
				}*/
			}
		}
		for(int i=0;i<results.length;i++)
		{
			System.out.println(results[i]);
		}
		
	}
	static boolean check(int arr[],int a)
	{
		long sum1=0,sum2=0;
		for(int i=0;i<a;i++)
		{
			sum1 = sum1 + arr[i];
		}
		for(int i=a+1;i<arr.length;i++)
		{
			sum2 = sum2 + arr[i];
		}
		if(sum1 == sum2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
