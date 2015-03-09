import java.util.*;
import java.io.*;
public class RecursiveMethodToSortAnArrayInLinearTime {
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
		int start = 0,temp=0;
		int end = arr.length-1;
		while(start < end)
		{
			swap(start++,end--);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	static void swap(int a,int b)
	{
		//System.out.println("here");
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
