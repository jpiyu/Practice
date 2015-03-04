import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AllCombinationsOfStrings {
	static char[] arr;
	static int count;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		arr = str.toCharArray();
		int length = arr.length;
		permute(0,length-1);
	}
	static void permute(int i,int n)
	{
		if(i == n)
		{
			count++;
			print();
		}
		else
		{
			for(int j=i;j<=n;j++)
			{
				swap(i,j);
				permute(i+1,n);
				swap(i,j);
			}
		}
	}
	static void print()
	{
		System.out.print(count + " --> ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	static void swap(int low,int up)
	{
		char temp = arr[low];
		arr[low] = arr[up];
		arr[up] = temp;
	}
}
