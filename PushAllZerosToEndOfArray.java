import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class PushAllZerosToEndOfArray {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an array with zeros in it");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);

		}
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				arr[j++] = arr[i];
			}
		}
		while(j != arr.length)
		{
			arr[j] = 0;
			j++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
