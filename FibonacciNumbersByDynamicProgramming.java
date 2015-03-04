package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FibonacciNumbersByDynamicProgramming {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the index upto which you want to find the fibonacci numbers");
		int index = Integer.parseInt(br.readLine());
		int arr[] = new int[index+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<arr.length;i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println("now showing you all the fibonacci numbers upto the index you demanded");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
