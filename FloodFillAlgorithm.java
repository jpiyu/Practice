/**
 * algorithm to show how ms paint works 
 */

import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class FloodFillAlgorithm {
	public static void main(String[] arsg) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Insert the size of screen");
		String[] str = br.readLine().split("x");
		int[][] screen = new int[Integer.parseInt(str[0])][Integer.parseInt(str[1])];
		for(int i=0;i<screen.length;i++)
		{
			String[] line = br.readLine().split(" ");
			for(int j=0;j<screen[i].length;j++)
			{
				screen[i][j] = Integer.parseInt(line[j]);
			}
		}
		/*for(int i=0;i<screen.length;i++)
		{
			for(int j=0;j<screen[i].length;j++)
			{
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
		}*/
		
		System.out.println("Enter the starting point along with the old value and the new value of the pixel");
		String[] line = br.readLine().split(" ");
		int x = Integer.parseInt(line[0]);
		int y = Integer.parseInt(line[1]);
		int oldValue = Integer.parseInt(line[2]);
		int newValue = Integer.parseInt(line[3]);
		
		upgrade(screen,x,y,oldValue,newValue);
		for(int i=0;i<screen.length;i++)
		{
			for(int j=0;j<screen[i].length;j++)
			{
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	static void upgrade(int[][] screen,int x,int y,int oldValue,int newValue)
	{
		if(x > screen.length-1 || y > screen[0].length-1 || x < 0 || y < 0)
		{
			return;
		}
		if(screen[x][y] != oldValue)
		{
			return;
		}
		screen[x][y] = newValue;
		upgrade(screen, x-1, y, oldValue, newValue);
		upgrade(screen, x, y-1, oldValue, newValue);
		upgrade(screen, x+1, y, oldValue, newValue);
		upgrade(screen, x, y+1, oldValue, newValue);
	}
}
