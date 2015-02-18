import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AllSumCombinations {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int arr[] = new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		int total = Integer.parseInt(br.readLine());
		computeElements(arr,length,total);
	}
	public static void computeElements(int[] arr,int length,int total)
	{
		//System.out.println("inside the function");
		int temp = total;
		int sec_arr[] = new int[length];
		int j=0;
		if(length == 0)
		{
			//System.out.println("length is zero");
			return;
		}
		for(int i=length-1;i>=0;i--)
		{
			if(temp == 0)
			{
				//System.out.println("temporary total is zero now");
				break;
			}
			if(temp > arr[i])
			{
				//System.out.println("checking");
				//System.out.println("here");
				sec_arr[j++] = arr[i];
				temp -= arr[i];
			}
			
		}
		System.out.println("now");
		printArray(sec_arr);
		computeElements(arr,length-1,total);
	}
	public static void printArray(int[] arr2)
	{
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
