import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class HackerEarth_NoOfRK {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			System.out.println("enter the string");
			String str = br.readLine();
			int length = str.length();
			int[][] array = new int[length][length];
			if(str.charAt(0) == 'R')
			{
				array[0][0] = 1;
			}
			else if(str.charAt(0) == 'K')
			{
				array[0][0] = 0;
			}
			for(int i=0;i<array.length;i++)
			{
				for(int j=i;j<array[0].length;j++)
				{
					if(i == 0 && j == 0)
					{
						continue;
					}
					
					else
					{
						if(str.charAt(j) == 'K')
						{
							array[i][j] = array[i][j-1] + 1;
						}
						if(str.charAt(j) == 'R')
						{
							array[i][j] = array[i][j-1];
						}
					}
				}
			}
			for(int i=0;i<array.length;i++)
			{
				for(int j=0;j<array[0].length;j++)
				{
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			testCases--;
		}
	}
}
