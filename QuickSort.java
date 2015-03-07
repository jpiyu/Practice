import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class QuickSort {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the elements of the array inone line");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		int[] finalArray = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int maxElement = findMaxElement(arr);
		//System.out.println(maxElement);
		quickSort(arr,finalArray,maxElement);
	}
	static int findMaxElement(int[] arr)
	{
		int max = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				max = i;
			}
		}
		return arr[max];
	}
	static void quickSort(int[] arr,int[] finalArray,int maxElement)
	{
		int countingMatrix[] = new int[maxElement+1];
		for(int j=0;j<countingMatrix.length;j++)
		{
			countingMatrix[j] = 0;
		}
		for(int j=0;j<arr.length;j++)
		{
			if(countingMatrix[arr[j]] == 0)
			{
				countingMatrix[arr[j]] = 1;
				continue;
			}
			if(countingMatrix[arr[j]] != 0)
			{
				countingMatrix[arr[j]] = countingMatrix[arr[j]]+1;
			}
		}
		/*for(int j=0;j<countingMatrix.length;j++)
		{
			System.out.println(countingMatrix[j] + " ");
		}*/
		int k =0;
		for(int i=0;i<countingMatrix.length;i++)
		{
			int j = countingMatrix[i];
			while(j > 0 )
			{
				//System.out.println(i);
				finalArray[k++] = i;
				j--;
			}
		}
		for(int j=0;j<finalArray.length;j++)
		{
			System.out.print(finalArray[j] + " ");
		}
	}
}
