import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class PandaAndXOR {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of the array");
		int size = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int[][] maxor = new int[size][size];
		for(int i=0;i<size;i++)
		{
			maxor[i][i] = arr[i];
		}
		for(int i=0;i<maxor.length;i++)
		{
			for(int j=0;j<maxor[0].length;j++)
			{
				if(i == j || i > j)
				{
					continue;
				}
				else
				{
					maxor[i][j] = maxor[i][j-1] ^ arr[j];
				}
			}
		}
		printArray(maxor);
	}
	static void printArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
