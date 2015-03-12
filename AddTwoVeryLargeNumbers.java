import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AddTwoVeryLargeNumbers {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first number");
		char[] c1 = br.readLine().toCharArray();
		System.out.println("enter the second array");
		char[] c2 = br.readLine().toCharArray();
		int lengthDifference = Math.abs(c2.length - c1.length);
		if(c2.length < c1.length)
		{
			
		}
		else if(c1.length < c2.length)
		{
			
		}
	}
}
