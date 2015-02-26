package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AmazonNextGreaterElement {
	static int[] arr;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("find the next greater number corresponding to each element");
		for(int i=0;i<arr.length-1;i++)
		{
			int nextGreater = findNextGreaterElement(i);
			System.out.println(arr[i] + " --> " + nextGreater);
		}
		System.out.println(arr[arr.length-1] + " --> " + arr[arr.length-1]);
	}
	public static int findNextGreaterElement(int i)
	{
		/*if(i == arr.length)
		{
			return arr[i];
		}*/
		int j = i+1;
		while(arr[j] < arr[i])
		{
			j++;
			if(j == arr.length)
			{
				return arr[i];
			}
		}
		return arr[j];
	}
}
