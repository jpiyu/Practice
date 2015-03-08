import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class LinearSearch {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		int [] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter the element you want to search");
		int element = Integer.parseInt(br.readLine());
		int index = 0;
		while(index < arr.length && arr[index] != element)
		{
			index++;
		}
		System.out.println("the element is found at index : " + index);
	}
}
