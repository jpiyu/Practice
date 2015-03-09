import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class ReverseAnArrayInLinearTime {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		int [] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int start = 0,temp=0;
		int end = arr.length-1;
		while(end > start)
		{
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			end--;
			start++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
