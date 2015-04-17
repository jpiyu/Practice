import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class LongestIncreasingPath {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter the number of testCases");
		int testCases = Integer.parseInt(br.readLine());
		while (testCases > 0) {
			//System.out.println("enter the dimensions");
			String[] str = br.readLine().split(" ");
			int rows = Integer.parseInt(str[0]);
			int columns = Integer.parseInt(str[1]);
			int[][] array = new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				String[] arr = br.readLine().split(" ");
				for(int j=0;j<arr.length;j++)
				{
					array[i][j] = Integer.parseInt(arr[j]);
				}
			}
			/*for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}*/
			int[][] pathArray = new int[rows][columns];
			pathArray[0][0] = 1;
			for(int i=1,j=1;i<rows || j<columns;i++,j++)
			{
				pathArray[0][i] = (array[0][i] > array[0][i-1]) ? pathArray[0][i-1] + 1 : pathArray[0][i-1];
				pathArray[j][0] = (array[j][0] > array[j-1][0]) ? pathArray[j-1][0] + 1 : pathArray[j-1][0] ;
			}

			for(int i=1;i<rows;i++)
			{
				for(int j=1;j<columns;j++)
				{
					if(i == 0 || j == 0)
					{
						continue;
					}
					else
					{
						if(array[i][j] > array[i-1][j] && array[i][j] <= array[i][j-1])
						{
							pathArray[i][j] = pathArray[i-1][j] + 1;
						}
						else if(array[i][j] <= array[i-1][j] && array[i][j] > array[i][j-1])
						{
							pathArray[i][j] = pathArray[i][j-1] +1;
						}
						else
						{
							int max = max(pathArray[i-1][j],pathArray[i][j-1]);
							{
								pathArray[i][j] = max + 1;
							}
						}
					}
				}
			}

			/*for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print(pathArray[i][j] + " ");
				}
				System.out.println();
			}*/

			//System.out.println("the longest increasing path is of length : " + pathArray[rows-1][columns-1]);
			System.out.println(pathArray[rows-1][columns-1]);
			testCases--;
		}
	}
	static int max(int a,int b)
	{
		return (a >= b) ? a : b;
	}
}
