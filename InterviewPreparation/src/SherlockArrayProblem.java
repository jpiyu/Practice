import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class SherlockArrayProblem {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int numberOfArrays = testCases;
		while(testCases > 0)
		{
			int[][] arr = new int[numberOfArrays][];
			int[][] lengths = new int[numberOfArrays][];
			String[][] arrays = new String[numberOfArrays][];
			//int length[] = new int[testCases];
			for(int i=0;i<numberOfArrays;i++)
			{
				/*lengths[numberOfArrays][i] = Integer.parseInt(br.readLine());
				arrays[numberOfArrays][i] = br.readLine().split(" ");*/
				int length = Integer.parseInt(br.readLine());
			}
		}
	}
}
