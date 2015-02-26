package Miscellaneous;

/**
 * @author Piyu
 * in this program we have to define a window size and find out the max element in that window and keep shifting the window by one place
 */

import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ArrayWindowAmazonQuestion {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the array");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter the window size");
		int k = Integer.parseInt(br.readLine());
		int start = 0;
		int end = k;
		while(k < arr.length)
		{
			end = k-1;
			int max = start;
			int temp = 0;
			int i = 0;
			for(i=start+1;i<=end;i++)
			{
				if(arr[i] > arr[max])
				{
					max = i;
				}
			}
			System.out.println(arr[max]);
			k++;
			start++;
		}
	}
}
