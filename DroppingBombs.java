import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class DroppingBombs {
	static int[][] array;
	static int numOfDestructs;
	static int rows,columns;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of testCases");
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			System.out.println("enter the dimensions of the matrix");
			String[] dimensions = br.readLine().split(" ");
			rows = Integer.parseInt(dimensions[0]);
			columns = Integer.parseInt(dimensions[1]);
			array = new int[rows][columns];
			for(int i=0;i<rows;i++)
			{
				String[] str = br.readLine().split(" ");
				for(int j=0;j<columns;j++)
				{
					array[i][j] = Integer.parseInt(str[j]);
				}
			}
			System.out.println("enter the co-ordinates of the location where the bomb is dropped");
			String[] coOrdinates = br.readLine().split(" ");
			int xCor = Integer.parseInt(coOrdinates[0]);
			int yCor = Integer.parseInt(coOrdinates[1]);
			destruct(xCor,yCor);
			System.out.println("printing the leftover place");
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println(numOfDestructs);
			testCases--;
		}
	}
	static void destruct(int x,int y)
	{
		if(x < 0 || y < 0 || x == rows || y == columns)
		{
			return;
		}
		if(array[x][y] != 0)
		{
			array[x][y] = 0;
			numOfDestructs++;
			destruct(x-1,y);
			destruct(x,y-1);
			destruct(x+1,y+1);
			destruct(x-1,y-1);
			destruct(x,y+1);
			destruct(x+1,y);
		}
		else
		{
			return;
		}
	}
}

