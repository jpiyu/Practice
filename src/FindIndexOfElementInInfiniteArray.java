import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindIndexOfElementInInfiniteArray {
	static int[] arr;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array in one line only");
		String[] str = br.readLine().split(" ");
		arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter the element of which you want to find out the index");
		int number = Integer.parseInt(br.readLine());
		int lowerIndex = 0;
		int higherIndex = 1;
		while(arr[higherIndex] < number)
		{
			lowerIndex = higherIndex;
			higherIndex *= 2;
		}
		System.out.println(lowerIndex);
		System.out.println(higherIndex);
		int index = binarySearch(lowerIndex,higherIndex-1,number);
		System.out.println("The element which you want to find is at position : " + " --> " +  index);
	}
	static int binarySearch(int low,int up,int element)
	{
		System.out.println("low : " + low + " up : " + up);
		int mid = low + (up-low)/2;
		//System.out.println(arr[mid]);
		System.out.println("the value of mid" + mid);
		int returnValue = 0;
		if(up >= low)
		{
			if(element == arr[mid])
			{
				return mid;
			}
			else if(element > arr[mid])
			{
				binarySearch(mid+1,up,element);
			}
			return binarySearch(low,mid-1,element);
		}
		return -1;
	}
}
