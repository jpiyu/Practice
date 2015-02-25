package Sorting;
import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Selection {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("now performing selection sort");
		Thread.currentThread().sleep(2000);
		for(int i=0;i<arr.length-1;i++)     // we can iterate here only upto the second last element here //
		{
			int min = i;
			int temp = 0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
