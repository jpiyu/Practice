import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class SortArrayAccordingToFrequency {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int max = findMax(arr);
		//System.out.println(max);
		int newArray[] = new int[max+1];
		//System.out.println(newArray.length);
		for(int i=0;i<newArray.length;i++)
		{
			newArray[i] = 0;
		}
		for(int i=0;i<arr.length;i++)
		{
			newArray[arr[i]] = newArray[arr[i]]+1; 
		}
		/*for(int i=0;i<newArray.length;i++)
		{
			System.out.print(newArray[i]);
		}*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(list.size() != arr.length)
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
				//System.out.println(i);
				max = i;
			}
		}
		return arr[max];
	}
}
