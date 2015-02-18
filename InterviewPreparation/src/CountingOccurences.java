import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CountingOccurences {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int[] arr = new int[array.length];
		int[] occurences = new int[100];
		for(int i=0;i<array.length;i++)
		{
			arr[i] = Integer.parseInt(array[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(occurences[arr[i]] == 0)
			{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					(occurences[arr[i]])++;
				}
			}
			}
		}
		for(int i=0;i<occurences.length;i++)
		{
			System.out.print(occurences[i] + " ");
		}
	}
}
