package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FactorialByDynamicProgramming {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number of which you want to know the factorial");
		int number = Integer.parseInt(br.readLine());
		int arr[] = new int[number+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<arr.length;i++)
		{
			arr[i] = i*arr[i-1];
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		System.out.println(arr[arr.length-1]);
	}
}
