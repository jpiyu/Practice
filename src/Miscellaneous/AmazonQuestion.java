package Miscellaneous;

/**
 * @author Piyu
 * this is a program to find an element in an array in which the elements are increasing at first and then decreasing
 *
 */
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AmazonQuestion {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter the array in one line only");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("please insert the number whose index you want to find out");
		int number = Integer.parseInt(br.readLine());
		int i=0,j=arr.length-1;
		int finalIndex = 0;
		while(i != j)
		{
			if(arr[i] == number)
			{
				finalIndex = i;
				break;
			}
			if(arr[j] == number)
			{
				finalIndex = j;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(finalIndex);
	}
}
