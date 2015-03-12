import java.io.*;
import java.util.*;
import static java.lang.System.*;
public class ConvertIPIntoLong {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ip address");
		String[] str = br.readLine().split(".");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		int [] arr = new int[str.length];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		long longValue = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			longValue = longValue + (long)(arr[i]*Math.pow(256, i));
		}
		System.out.println(longValue);
	}
}
