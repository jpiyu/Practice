import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class SuperTables 
{
	static int[] arrayA;
	static int[] arrayB;
	static int[] arrayN;
	static int[] arrayTable;
	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		arrayA = new int[testCases];
		arrayB = new int[testCases];
		arrayN = new int[testCases];
		int num1=0,num2=0;
		int y = 0;
		while( y < testCases)
		{
			String array[] = br.readLine().split(" ");
			arrayA[y] = Integer.parseInt(array[0]);
			arrayB[y] = Integer.parseInt(array[1]);
			arrayN[y] = Integer.parseInt(array[2]);
			y++;
		}
		y=0;
		while(y < testCases)
		{
			int k = 0;
			//int N = 0;
			//arrayTable = new int[arrayN[y]];

			for(int i=1;i<=arrayN[y];i++)
			{
				num1 = arrayA[y] * i;
				num2 = arrayB[y] * i;
				if(num1 == num2)
				{
					//arrayTable[k++] = num1;
					k = k+1;
					if(k == arrayN[y])
					{
						System.out.println(num1);
						break;
					}
				}
				else
				{
					//arrayTable[k++] = num1;
					//arrayTable[k++] = num2;
					k = k+1;
					if(k == arrayN[y])
					{
						System.out.println(num1);
						break;
					}
					k = k+1;
					if(k == arrayN[y])
					{
						System.out.println(num2);
						break;
					}
				}
			}
			
			//System.out.println(arrayTable[arrayN[y]-1]);
		y++;
		}
	}
}
