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
		if(str.charAt(0) == '1')
		{
			arr[0][0] = 1;
		}
		else
		{
			arr[0][0] = 0;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr[i].length;j++)
			{
				if(j == 0)
				{
					arr[i][j] = 0;
					continue;
				}
				if(str.charAt(j) == '1')
				{
					arr[i][j] = arr[i][j-1]+1;
				}
				else
				{
					arr[i][j] = arr[i][j-1];
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
