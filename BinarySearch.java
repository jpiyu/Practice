import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the array, and enter it in one line only separated by spaces");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		System.out.println("Please enter the value you want to lookup into the array");
		int value = Integer.parseInt(br.readLine());
		int foundIndex = binarySearch(value,arr,0,arr.length-1);
		System.out.println("Element found at -->" + foundIndex);
	}
	public static int binarySearch(int lookupValue,int[] arr,int start,int end)
	{
		int i = start;
		int j = end;
		int mid = (start + end)/2;
		while(i < j)
		{
			if(lookupValue > arr[mid])
			{
				return binary8Search(lookupValue,arr,mid+1,end);
			}
			else if(lookupValue < arr[mid])
			{
				return binarySearch(lookupValue,arr,start,mid-1);
			}
			return mid;
		}
		return 0;
	}
}
