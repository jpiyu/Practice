import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class LongestIncreasingPath {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of testCases");
		int testCases = Integer.parseInt(br.readLine());
		while (testCases > 0) {
			System.out.println("enter the dimensions");
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
			int[][] pathArray = new int[rows+1][columns+1];
			for(int i=0,j=0;i<rows || j<columns;i++,j++)
			{
				pathArray[1][j] = 0;
				pathArray[i][1] = 0;
			}

			for(int i=0;i<rows+1;i++)
			{
				for(int j=0;j<columns+1;j++)
				{
					System.out.print(pathArray[i][j] + " ");
				}
				System.out.println();
			}
			testCases--;
		}
	}
}
