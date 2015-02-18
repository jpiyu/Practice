import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class MatrixChainMultiplication {
	static int p[] = new int[]{1,2,3,4,3};

	public static void main(String[] args)
	{
		int length = p.length;
		System.out.println(length);
		System.out.println(findCost(p,5));
	}
	public static int findCost(int[] array,int n1)
	{
		int n = array.length;
		int m[][] = new int[n][n];
		for(int i=1;i<n;i++)
		{
			m[i][i] = 0;
		}
		for(int l=2;l<n;l++)
		{
			for(int i=1;i<=n-l;i++)
			{
				int j = i+l-1;
				m[i][j] = Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++)
				{
					//System.out.println("1");
					int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
					if(q < m[i][j])
					{
						m[i][j] = q;
					}
				}
			}
		}
		return m[1][n-1];
	}
}
