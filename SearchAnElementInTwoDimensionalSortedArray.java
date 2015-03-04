import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SearchAnElementInTwoDimensionalSortedArray {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of the two dimensional array in the form of LENGTH X BREADTH");
		String[] dimensions = br.readLine().split("x");
		int[][] array = new int[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];
		System.out.println("now enter the elements row wise");
		
		for(int i=0;i<array.length;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<array[0].length;j++)
			{
				array[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		System.out.println("Enter the element to be searched");
		int number = Integer.parseInt(br.readLine());
		int column = array.length-1;
		int row = 0;
		while(number > array[row][column])
		{
			//System.out.println("d" + array[row][column]);
			//System.out.println("row" + row);
			row++;
		}
			
		//System.out.println(row);
		for(int i=0;i<array[row].length;i++)
		{
			if(array[row][i] == number)
			{
				System.out.println("the element found at location : " + row + " " + i);
				return;
			}
		}
		
	}
}
