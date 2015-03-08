import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindIfSubsetSumIsZero {
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
		array[0][0] = arr[0];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				array[i][j] = 0;
			}
		}
		for(int gap=0;gap<arr.length;gap++)
		{
			for(int i=0,j=gap;j<arr.length;i++,j++)
			{
				if(i == j)
				{
					array[i][j] = arr[i];
					if(array[i][j] == 0)
					{
						System.out.println("the array has a sum between these nodes : " + i + " " + j);
					}
					continue;
				}
					array[i][j] = arr[j] + array[i][j-1];
					if(array[i][j] == 0)
					{
						System.out.println("the array has a sum between these nodes : " + i + " " + j);
					}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
