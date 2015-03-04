import java.util.*;
import java.io.*;
public class PartitionDemo {
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
		int pivloc = partition(arr,0,arr.length-1,arr.length-1);
		System.out.println(pivloc);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	static int partition(int[] arr,int low,int high,int pivot)
	{
		int pivElem = arr[pivot];
		int temp;
		while(low < high)
		{
			while(arr[low] < pivElem)
			{
				low++;
			}
			while(arr[high] > pivElem)
			{
				high--;
			}
			if(arr[low] > arr[high])
			{
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
			else
			{
				low++;
				high--;
			}
		}
		return low;
	}
}
