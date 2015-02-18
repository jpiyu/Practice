import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class TrackingChangesInInsertionSort {
	static int changes;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int arr[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			arr[i] = Integer.parseInt(array[i]);
		}
		for(int j=1;j<arr.length;j++)
		{
			for(int k=0;k<=j-1;k++)
			{
				//int l = arr[j];
				if(arr[j] < arr[k])
				{
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
					changes++;
				}
			}
		}
		System.out.println(changes);
	}
}
