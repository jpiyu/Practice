import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class GoldMine {
	static int[][] array;
	static int[][] testCaseArray;
	static int[] results;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dimensions = br.readLine().split(" ");
		
		for(int i=0;i<dimensions.length;i++)
		{
			array = new int[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
		}
		for(int i=0;i<Integer.parseInt(dimensions[0]);i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(dimensions[1]);j++)
			{
				array[i][j] = Integer.parseInt(str[j]);
			}
		}
		int testCases = Integer.parseInt(br.readLine());
		testCaseArray = new int[testCases][4];
		results = new int[testCases];
		for(int i=0;i<testCases;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<4;j++)
			{
				testCaseArray[i][j] = Integer.parseInt(str[j])-1;
			}
		}
		for(int i=0;i<testCases;i++)
		{
				int x1 = testCaseArray[i][0];
				int y1 = testCaseArray[i][1];
				int x2 = testCaseArray[i][2];
				int y2 = testCaseArray[i][3];
				int sum = 0;

				for(int j=x1;j<=x2;j++)
				{
					for(int k=y1;k<=y2;k++)
					{
						sum = sum + array[j][k];
						results[i] = sum;
					}
				}
		}	
		for(int i=0;i<results.length;i++)
		{
			System.out.println(results[i]);
		}
	}
}
