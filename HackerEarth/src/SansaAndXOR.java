import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class SansaAndXOR {
	static int[] arr;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y = 0;
		while(y < testCases)
		{
			int size = Integer.parseInt(br.readLine());
			arr = new int[size];
			String[] array = br.readLine().split(" ");
			for(int i=0;i<size;i++)
			{
				arr[i] = Integer.parseInt(array[i]);
			}
			int increment = 0;
			int result = 0;
			int innerSize = 1;
			while(innerSize <= size)
			{
				//int lowIndex = index;
				for(int i=0;i<size;i++)
				{ 
					int index = 0;
					int lowIndex = i;
					int highIndex = i + increment;
					int[] arr2 = new int[innerSize];
					for(int j=i;j<=highIndex;j++)
					{
						if(index <= highIndex)
						{
							System.out.println("index" + index);
						arr2[index++] = arr[j];
						//index++;
						//System.out.println("index" + index);
						}
						
					}
					for(int k=0;k<innerSize;k++)
					{
						System.out.println(arr2[k] + " ");
					}
					result = result + xorFunction(arr2);
					
				}
				innerSize++;
				increment++;
			}
			y++;
			
		}
	}
	static int xorFunction(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
}
