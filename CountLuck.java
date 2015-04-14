import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CountLuck {
	static int startX,startY,endX,endY;
	static char[][] map;

	static int xMove[] = {-1,1,0,0};
	static int yMove[] = {0,0,1,-1};
	static int rows,columns;
	static File fout = new File("output.txt");
	static BufferedWriter bw;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		bw = new BufferedWriter(new FileWriter(fout));
		while(testCases >0)
		{
			String[] dimensions = br.readLine().split(" ");
			rows  = Integer.parseInt(dimensions[0]);
			columns = Integer.parseInt(dimensions[1]);
			map = new char[rows][columns];
			for(int i=0;i<rows;i++)
			{
				String line = br.readLine();
				for(int j=0;j<columns;j++)            //the length of the string is equal to the number of columns
				{
					map[i][j] = line.charAt(j);
					if(map[i][j] == 'M')
					{
						startX = i;
						startY = j;
					}
					if(map[i][j] == '*')
					{
						endX = i;
						endY = j;
					}
				}
			}
			/*for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					System.out.print(map[i][j]);
				}
				System.out.println();
			}*/
			//System.out.println(startX + " " + startY);
			int currX = startX;
			int currY = startY;
			if(checkMove(0,startX,startY,map))
			{
				System.out.println("Impressed");
			}
			else
			{
				System.out.println("Oops!");
			}
			testCases--;
		}
	}
	static boolean checkMove(int index,int x,int y,char[][] map) throws Exception
	{
		bw.write("entering");
		bw.newLine();
		int xi=0,yi=0;
		if(x == endX && y == endY)
		{
			return true;
		}
		if(isSafe(x,y))
		{
			if(map[startX][startY] != 'X')
			{
				map[startX][startY] = 'X';
			}
			else
			{
			map[x-xMove[index]][y-yMove[index]] = 'X';
			}
			bw.write(x + "   " + y);
			bw.newLine();
			for(int i=0;i<xMove.length;i++)
			{
				//System.out.println(i);
				xi = x + xMove[i];
				yi = y + yMove[i];
				bw.write(xi + " --- " + yi);
				bw.newLine();
				if(checkMove(i,xi,yi,map))
				{
					return true;
				}
				else
				{
					continue;
				}
			}
		}
		else
		{
		return false;
		}
		return false;
	}
	static boolean isSafe(int x,int y) throws Exception
	{
		if(x < rows && y < columns && x >= 0 && y >= 0 && map[x][y] != 'X')
		{
			bw.write("Safe");
			return true;
		}
		return false;
	}
}
