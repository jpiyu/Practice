import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindFirstRepeatingElement {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array in one line");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(set.contains(arr[i]))
			{
				System.out.println("the first element is : " + arr[i]);
				return;
			}
			else
			{
				set.add(arr[i]);
			}
		}
	}
}
