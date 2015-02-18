import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class TaumAndBirthday {
	static int numberArray[];
	static int costArray[];
	static int totalCostAllBlack,totalCostAllWhite,costConvertingBTW,costConvertingWTB,minCost;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y =0;
		while(y<testCases)
		{
			String[] numbers = br.readLine().split(" ");
			String[] costs = br.readLine().split(" ");
			numberArray = new int[2];
			costArray = new int[3];
			for(int i=0;(i<2);i++)
			{
				numberArray[i] = Integer.parseInt(numbers[i]);
			}
			for(int j=0;j<3;j++)
			{
				costArray[j] = Integer.parseInt(costs[j]);
			}
			y++;
		}
		y =0;
		while(y < testCases)
		{
			totalCostAllBlack = numberArray[0]*costArray[0];
			totalCostAllWhite = numberArray[1]*costArray[1];
			costConvertingBTW = numberArray[0]*costArray[2];
			costConvertingWTB = numberArray[1]*costArray[2];
			if((totalCostAllBlack+totalCostAllWhite) < (totalCostAllBlack+costConvertingBTW))
			{
				minCost = totalCostAllBlack+totalCostAllWhite;
			}
			else
			{
				minCost = totalCostAllBlack+costConvertingBTW;
			}
			if(minCost > totalCostAllWhite+costConvertingWTB)
			{
				minCost = totalCostAllWhite+costConvertingWTB;
			}
			System.out.println(minCost);
			
			y++;
		}
	}
}
