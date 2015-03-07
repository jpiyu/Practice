import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindFirstOddElement {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the sequence of colors of tshirts of people coming in the ground");
		String[] arr = br.readLine().split(" ");
		String c = arr[0];
		int i=0;
		System.out.println(c);
		while(arr[i].equals(c))
		{
			i++;
		}
		System.out.println("The first distinct element found at : " + i);
	}
}
