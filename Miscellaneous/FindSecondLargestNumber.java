// PROGRAM TO FIND SECOND LARGEST ELEMENT IN AN ARRAY IN ONE INTERATION // 

import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindSecondLargestNumber {
	public static void main(String[] args) throws Exception
	{
		int first=0,second=0,temp=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		if(arr[0] > arr[1])
		{
			first = arr[0];
			second = arr[1];
		}
		else
		{
			first = arr[1];
			second = arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i] > first)
			{
				second = first;
				first = arr[i];
				continue;
			}
			if(arr[i] < first && arr[i] > second)
			{
				second = arr[i];
				continue;
			}
		}
		System.out.println(first + "------" + second);
	}
}
