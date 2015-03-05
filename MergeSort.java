import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class MergeSort {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array in one line only");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		mergeSort(arr,0,arr.length);
	}
	static void mergeSort(int[] arr,int low,int high)
	{
		int mid = (low+high)/2;
		while(high > low)
		{
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
	}
	static void merge(int[] arr,int low,int mid,int high)
	{
		int n1 = mid-low+1;
		int n2 = high-mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for(int i=0;i<n1;i++)
		{
			arr1[i] = arr[low+i];
		}
		for(int j=0;j<n2;j++)
		{
			arr2[j] = arr[mid+1+j];
		}
		int i = 0;
		int  j = 0;
		int k = low;
		while (i < n1 && j < n2)
		{
			if (arr1[i] <= arr2[j])
			{
				arr[k] = arr1[i];
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		/* Copy the remaining elements of L[], if there are any */
		while (i < n1)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}

		/* Copy the remaining elements of R[], if there are any */
		while (j < n2)
		{
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
}
