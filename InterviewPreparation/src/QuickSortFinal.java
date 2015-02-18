import static java.lang.System.*;
import java.io.*;
import java.util.*;
class QuickSortFinal
{
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	static int array[] = new int[6];

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int size = Integer.parseInt(br.readLine());
		//int array[] = new int[6];
		for(int i=0;i<6;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		quickSort(array,0,5);
	}
	static void quickSort(int[] arr,int low, int high)
	{
		int pivloc = partition(arr,low,high);
		quickSort(arr,low,pivloc-1);
		quickSort(arr,pivloc+1,high);
	}
	static int partition(int arr[],int low, int high)
	{
		int pivot = arr[low];
		int pivloc = 0;
		for(int i=low+1;i<arr.length;i++)
		{
			if(arr[i] <= pivot)
			{
				list1.add(arr[i]);
			}
			else
			{
				list2.add(arr[i]);
			}
		}
		for(int i=0;i<list1.size();i++)
		{
			array[i] = list1.get(i);
		}
		array[list1.size()] = pivot;
		for(int i=0;i<list2.size();i++)
		{
			array[list1.size()+i] = list2.get(i);
		}
		list1.clear();list2.clear();
		pivloc = list1.size() + low;
		return pivloc;
	}
}
