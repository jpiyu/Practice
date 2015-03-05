import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class ConvertingAnArrayIntoBinarySearchTree {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array of all the elements in one line");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
	}
}
