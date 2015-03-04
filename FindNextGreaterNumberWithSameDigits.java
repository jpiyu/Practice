package DynamicProgramming;
import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class FindNextGreaterNumberWithSameDigits {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		String[] str = br.readLine().split("");
		int[] arr = new int[str.length-1];
		for(int i=1;i<str.length;i++)
		{
			str[i-1] = str[i];
		}
		for(int i=0;i<str.length-1;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		int position = arr.length-1;
		while(arr[position] < arr[position-1])
		{
			position--;
		}
		System.out.println(position);
		int low = arr[position+1];
		for(int i=position+2;i<arr.length;i++)
		{
			if(arr[i] < arr[low])
			{
				low = i;
			}
		}
		int temp = arr[position-1];
		arr[position-1] = arr[low];
		arr[low] = temp;
		Arrays.sort(arr, position, arr.length);
		
		temp = arr[position-1];
		arr[position-1] = arr[low];
		arr[low] = temp;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}	
