import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SwapIt2 {
	public static void main(String [] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases >0)
		{
			String[] str1 = br.readLine().split(" ");
			int numberOfElements = Integer.parseInt(str1[0]);
			int swaps = Integer.parseInt(str1[1]);
			String[] str2 = br.readLine().split(" ");
			//System.out.println(str2);
			int[] arr = new int[str2.length];
			int[] sec_arr= new int[str2.length];
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = Integer.parseInt(str2[i]);
			}
			sec_arr = arr;
			int i=0;
			while(swaps >0)
			{
				int min = findMin(arr,swaps);
				//System.out.println(min);
				while(swaps > 0)
				{
					swap(arr,min,min-1);
					min = min-1;
					swaps--;
					if(min == 0)
					{
						break;
					}
				}
				sec_arr[i++] = arr[0];
				
			}
			testCases--;
		}
	}
	static int findMin(int[] array,int endIndex)
	{
		int minIndex = 0;
		for(int j=1;j<=endIndex;j++)
		{
			if(array[j] < array[minIndex])
			{
				minIndex = j;
			}
		}
		return minIndex;
	}
	static int[] swap(int[] array,int a,int b)
	{
		int temp;
		temp = array[a];
		array[a] = array[b];
		array[b] = array[a];
		return array;
	}
}
