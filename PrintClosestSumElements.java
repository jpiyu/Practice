import static java.lang.System.*;

import java.io.*;
import java.util.*;

public class PrintClosestSumElements {
	public static void main(String[] args) throws Exception {
		//Stack<Character> stack = new Stack<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("enter the element of which you want to find out the nearest elements");
		int number = Integer.parseInt(br.readLine());
		int low = 0;
		int high = arr.length - 1;
		int resultLow = 0, resultHigh = high;
		int diff = Integer.MAX_VALUE;
		while(high > low)
		{
			if (Math.abs(arr[low] + arr[high] - number) < diff)
			{
				resultLow = low;
				resultHigh = high;
				diff = Math.abs(arr[low] + arr[high] - number);
			}
			if(arr[low] + arr[high] > number)
			{
				high--;
			}
			else
				low++;
		}
		System.out.println(arr[resultLow] + "    " + arr[resultHigh]);
	}
}
