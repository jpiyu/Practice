import static java.lang.System.*;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class LargestMultipleOf3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		Integer arr[] = new Integer[str.length];
		int output = 0;
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		int highestLength = findHighestLength(arr);
		//System.out.println(highestLength);
		for(int i=0;i<=highestLength;i++)
		{
			output = output + (int) (arr[i] * Math.pow(10, highestLength-i));
		}
		System.out.println(output);
	}
	static int findHighestLength(Integer[] arr)
	{
		int highestIndex =  arr.length-1;
		while((checkSum(arr,highestIndex) % 3) != 0 )
		{
			highestIndex--;
		}
		return highestIndex;
	}
	static int checkSum(Integer[] arr,int range)
	{
		int sum = 0;
		for(int j=0;j<=range;j++)
		{
			sum = sum + arr[j];
		}
		return sum;
	}
}
