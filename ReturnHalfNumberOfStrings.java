import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ReturnHalfNumberOfStrings {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string with spaces after each character");
		String str = br.readLine();
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
