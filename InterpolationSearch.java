import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class InterpolationSearch {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the elements in one line only");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		System.out.println("--- Please enter the element you want to search");
		int valueToSearch = Integer.parseInt(br.readLine());
		int index = interpolationSearch(valueToSearch,arr,0,arr.length-1);
		System.out.println("element found at index number ---->" + " " + index);
	}
	public static int interpolationSearch(int lookupValue,int[] arr,int start,int end)
	{
		if(start == end)
		{
			int value = arr[start];
			if(lookupValue == value)
			{
				return start;
			}
		}
		int mid = start + ((lookupValue - arr[start])* (end - start)) / arr[end] - arr[start];
		int midValue = arr[mid];
		if(midValue == lookupValue)
		{
			return mid;
		}
		if(midValue > lookupValue)
		{
			return interpolationSearch(lookupValue,arr,mid+1,end);
		}
		return interpolationSearch(lookupValue,arr,start,mid-1);
	}
}
