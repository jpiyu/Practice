import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class StringsThatStartAndEndWith1 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a binary string");
		String str = br.readLine();
		int arr[][] = new int[str.length()][str.length()];
		/*for(int i=1;i<arr.length;i++)
		{
			arr[i][0] = 0;
		}*/
		int record[][] = new int[arr.length][arr[0].length];
		int lastOne = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++)
			{
				arr[i][j] = (int)(str.charAt(j) - '0');
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		if(arr[0][0] == 1)
		{
			record[0][0] = 1;
			lastOne = 1;
		}
		for(int i=1;i<arr.length;i++)
		{
			record[i][0] = 0;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr[0].length;j++)
			{
				if(arr[i][j] == 1)
				{
					if(lastOne != 0)
					{
						record[i][j] = j+2-lastOne;
					}
					else
					{
						lastOne = j+1;
						record[i][j] = 1;
					}
				}
				else if(arr[i][j] == 0)
				{
					record[i][j] = record[i][j-1];
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(record[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//now find out the max element
	}
}
