import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class MagicSum {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		boolean status = false;
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
			int sum = 0;
			for(int i=leafNodes-1;i<arr.length-1;i++)
			{
				System.out.println("here1");
				int tempSum = getSum(arr,i,i+1);
				if(tempSum > sum)
				{
					System.out.println("here2");
					sum = tempSum;
				}
			}
			System.out.println(sum);
		}
	}
	public static int getSum(int[] arr,int lowerLimit,int upperLimit)
	{
		System.out.println("enter");
		int localSum = 0;
		for(int i=lowerLimit;i>=0;i=(i-1)/2)
		{
			System.out.println("phase 1");
			localSum = localSum + arr[i];
		}
		for(int i=0;i<=upperLimit;i=2*i+2)
		{
			System.out.println("phase2");
			localSum = localSum + arr[i];
		}
		return localSum;
	}
}
