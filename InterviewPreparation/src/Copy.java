import java.util.*;
import java.io.*;
public class Copy {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dimension = Integer.parseInt(br.readLine());
		char[][] map = new char[dimension][dimension];
		char[][] secondary = new char[dimension][dimension];
		char num;
		for(int i=0;i<dimension;i++)
		{
			char[] str = br.readLine().toCharArray();
			for(int j=0;j<dimension;j++)
			{
				map[i][j] = str[j];
			}
		}
		/*for(int i=0;i<dimension;i++)
		{
			for(int j=0;j<dimension;j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println("\n");
		}*/
		for(int i=1;i<dimension-1;i++)
		{
			for(int j=1;j<dimension-1;j++)
			{
				num = map[i][j];
				if((num > map[i-1][j]) && (num > map[i+1][j]) && (num > map[i][j-1]) && (num > map[i][j+1]))
				{
					secondary[i][j] = 'X';
				}
			}
		}
		for(int i=0;i<dimension;i++)
		{
			for(int j=0;j<dimension;j++)
			{
				//System.out.print(secondary[i][j]);
				if(secondary[i][j] == 'X')
				{
					map[i][j] = 'X';
				}
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
