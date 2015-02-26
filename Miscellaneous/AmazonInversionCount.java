package Miscellaneous;
/**
 * @author Piyu
 * this is a program to find out the number of inversions when an array has been given
 */
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AmazonInversionCount {
	public static void main(String[] args) throws Exception
	{
		int inversionCount = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the array of which you want to find out the inversion count");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Finding out the inversion count");
		Thread.currentThread().sleep(1000);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[i])
				{
					inversionCount++;
				}
			}
		}
		System.out.println("the number of disarrangements are : " + inversionCount);
	}
}
