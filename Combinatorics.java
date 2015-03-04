package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Combinatorics {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the value of n and r");
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int r = Integer.parseInt(str[1]);
		
		int[][] arr = new int[n+1][r+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=Math.min(r,i);j++)   // remember this point here
			{
				if(j==0 || j == i)
				{
					arr[i][j] = 1;
				}
				else
				{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=r;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
