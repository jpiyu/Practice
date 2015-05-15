import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class AppleFarmSolution {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the dimensions of the apple farm");
		int rows = Integer.parseInt(br.readLine());
		int columns = Integer.parseInt(br.readLine());
		int field[][] = new int[rows][columns];
		System.out.println("enter the number of apples in each tree");
		for(int i=0;i<rows;i++)
		{
			String[] rowValues = br.readLine().split(" ");
			for(int j=0;j<columns;j++)
			{
				field[i][j] = Integer.parseInt(rowValues[j]);
			}
		}
		int[][] resultArray = new int[rows][columns];
		resultArray[0][0] = field[0][0];
		for(int i=1;i<columns;i++)
		{
			resultArray[0][i] = field[0][i] + resultArray[0][i-1];
		}
		for(int i=1;i<rows;i++)
		{
			resultArray[i][0] = field[i][0] + resultArray[i-1][0];
		}
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<columns;j++)
			{
				//System.out.print(resultArray[i][j] + " ");
				int max = max(resultArray[i-1][j],resultArray[i][j-1]);
				resultArray[i][j] = max + field[i][j];
			}
			//System.out.println();
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int max(int a,int b)
	{
		return (a > b) ? a : b;
	}
}
