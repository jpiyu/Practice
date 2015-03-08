import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindTheNumbersOfZeros {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int index = 0;
		while(arr[index] != 0)
		{
			index++;
		}
		System.out.println(arr.length-index);
	}
}
