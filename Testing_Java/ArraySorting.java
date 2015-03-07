// BASIC CLASS "ARRAY" AND ITS IMPLEMENTATION //


import static java.lang.System.*;
import java.util.Arrays;
class ArraySorting
{
	public static void main(String[] args)
	{
		int count = 5;
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = count;
			count--;
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		System.out.println("the location of 3 is:" + Arrays.binarySearch(arr ,3));
	}
}
