import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class MagicSum {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		//boolean status = false;
		while(testCases >0)
		{
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int arr[] = new int[str.length];
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			int leafNodes = n/2 + 1;
			//System.out.println(leafNodes);
			int leafNodesArray[] = new int[leafNodes];
			int j = 0;
			for(int i=leafNodes-1;i<arr.length;i++)
			{
				leafNodesArray[j] = arr[i];
				j++;
			}
			/*for(int i=0;i<leafNodesArray.length;i++)
			{
				System.out.println(leafNodesArray[i]);
			}*/
			int sum = Integer.MIN_VALUE;
			for(int i=leafNodes-1;i<arr.length-1;i++)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					//System.out.println(i + "------" + k);
					//System.out.println("here1");
					int tempSum = getSum(arr,i,k);
					//System.out.println("tempSum == " + tempSum);
					//System.out.println("returned value" + tempSum);
					if(tempSum > sum)
					{
						//System.out.println("here2");
						sum = tempSum;
					}
				}
			}
			System.out.println(sum);
		}
	}
	public static int getSum(int[] arr,int lowerLimit,int upperLimit)
	{
		//System.out.println("enter");
		int localSum = 0;
		while(lowerLimit >= 0)
		{
			//System.out.println(lowerLimit + " ----- " + upperLimit);
			if(lowerLimit == upperLimit)
			{
				//System.out.println("here");
				localSum = localSum + arr[lowerLimit];
				break;
			}
			localSum = localSum + arr[lowerLimit] + arr[upperLimit];
			if(lowerLimit%2 == 0)
			{
				lowerLimit = (lowerLimit-2)/2;
			}
			else
			{
				lowerLimit = (lowerLimit-1)/2;
			}
			if(upperLimit%2 != 0)
			{
				upperLimit = (upperLimit-1)/2;
			}
			else
			{
				upperLimit = (upperLimit-2)/2;
			}
			
			//System.out.println(lowerLimit);
			/*if(lowerLimit == 0 || upperLimit == 0)
			{
				break;
			}*/
		}
		return localSum;
	}
}
