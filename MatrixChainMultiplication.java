package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class MatrixChainMultiplication {
	static int[] arr;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array in one line");
		String[] str = br.readLine().split(" ");
		arr = new int[str.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int minimumOperations = matrixChainMultiplication(arr,arr.length);
		System.out.println(minimumOperations);
	}
	static int matrixChainMultiplication(int[] arr,int length)
	{
		int[][] array = new int[length][length];
		for(int i=0;i<length;i++)
		{
			array[i][i] = 0;
		}
		for(int l=2;l<length;l++)
		{
			for(int i=1;i<=length-l+1;i++)
			{
				int j = i+l-1;
				array[i][j] = Integer.MAX_VALUE;
				for(int k=i;k<j;k++)
				{
					int q = array[i][k] + array[k+1][j] + arr[i-1]*arr[k]*arr[j];
					if(q < array[i][j])
					{
						array[i][j] = q;
					}
				}
			}
		}
		return array[1][length-1];
	}
}
