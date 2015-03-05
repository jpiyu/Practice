import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindCommonElementsInSeveralArrays {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		String[] dimensions = br.readLine().split("x");
		int[][] array = new int[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
		System.out.println("enter the array rowwise");
		for(int i=0;i<dimensions.length;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<str.length;j++)
			{
				array[i][j] = Integer.parseInt(str[j]);
			}
		}
		findCommon(array);
	}
	static void findCommon(int[][] array)
	{
		
	}
}
