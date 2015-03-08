/**
 * THIS PROGRAM ONLY SORTS THE DECIMAL ONES
 */

import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class BucketSort {
	static LinkedList<Double>[] buckets;
	public static void main(String[] argas) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		double arr[] = new double[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Double.parseDouble(str[i]);
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);		
		}*/
		int n = arr.length;
		int max = 0;
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				max = i;
			}
		}*/
		buckets = new LinkedList[n];
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i] = new LinkedList<Double>();
		}
		//System.out.println(n);
		for(int i=0;i<n;i++)
		{
			int index = (int)(n*arr[i]); 
			//System.out.println(index);
			buckets[index].add(arr[i]);
		}
		for(int i=0;i<buckets.length;i++)
		{
			LinkedList<Double> temp = buckets[i];
			Iterator<Double> iter = temp.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
	}
}
