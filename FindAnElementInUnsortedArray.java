import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindAnElementInUnsortedArray {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an array in which the elements are first in increasing order and then in decreasing order");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		// finding the maxElement
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				max = i;
			}
		}
		System.out.println("enter the element you want to discover");
		int element = Integer.parseInt(br.readLine());
		int j = max,i=max;
		while(i >= 0 && j < arr.length)
		{
			if(arr[i] == element)
			{
				System.out.println(i);
				return;
			}
			if(arr[j] == element)
			{
				System.out.println(j);
				return;
			}
			i--;
			j++;
		}
	}
}
