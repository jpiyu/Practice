package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LongestIncreasingSubsequence {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the elements of the array");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int lis = findLIS(arr);
		System.out.println(lis);
	}
	static int findLIS(int[] arr)
	{
		int[] associateArray = new int[arr.length];
		for(int i=0;i<associateArray.length;i++)
		{
			associateArray[i] = 1;
		}
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j] > arr[j-1])
			{
				associateArray[j] = associateArray[j-1] + 1;
			}
			else
			{
				associateArray[j] = associateArray[j-1];
			}
		}
		return associateArray[arr.length-1];
	}
}
