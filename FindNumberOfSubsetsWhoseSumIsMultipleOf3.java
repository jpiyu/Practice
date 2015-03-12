/** 
 * here we are finding all the subsets of size 2 and 3 whose sum is a multiple of 3
 */

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindNumberOfSubsetsWhoseSumIsMultipleOf3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array");
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int[][] array = new int[arr.length][arr.length];
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				array[i][j] = 0;
			}
		}
		for(int job = 2;job<=3;job++)
		{
			for(int i=0,j=job;j<arr.length;i++,j++)
			{
				if(i == j)
				{
					array[i][j] = arr[j];
					if(array[i][j]%3 == 0)
					{
						count++;
					}
					continue;
				}
				array[i][j] = arr[j] + array[i][j-1];
				if(array[i][j]%3 == 0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
