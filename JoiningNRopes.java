package Greedy;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class JoiningNRopes {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of ropes");
		int numberOfRopes = Integer.parseInt(br.readLine());
		System.out.println("Enter the length of each rope");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		
	}
}
