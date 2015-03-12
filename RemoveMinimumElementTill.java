import static java.lang.System.*;
import java.io.*;
public class RemoveMinimumElementTill {
	static int arr[];
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an array");
		String[] str = br.readLine().split(" ");
		arr = new int[str.length];
		while(2*findMin(arr) < findMax(arr))
		{
			
		}
	}
	static int findMax(int[] arr)
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[max])
			{
				max = i;
			}
		}
		return arr[max];
	}
	static int findMin(int[] arr)
	{
		int min = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > arr[min])
			{
				min = i;
			}
		}
		return min;
	}
}
