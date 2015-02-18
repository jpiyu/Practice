//this is a nice problem //

import java.io.*;
import java.util.*;
public class Encryption {
	static ArrayList<Character> list = new ArrayList<Character>();
	public static void main(String []args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//String str2 = str.trim();
		//System.out.println(str2);
		int length = str.length();
		//System.out.println(length);
		double sqrt = Math.sqrt(length);
		int floor = (int)Math.floor(sqrt);
		int ceil = (int)Math.ceil(sqrt);
		while(floor*ceil < length)
		{
			floor++;
			if(floor*ceil < length)
			{
				ceil++;
			}
			else
				break;
		}
		/*System.out.println(floor);
		System.out.println(ceil);
		*/
		int[][] array = new int[floor][ceil];
		for(int i=0;i<floor;i++)
		{
			for(int j=0;j<ceil;j++)
			{
				array[i][j] = ' ';
			}
		}
		int count = 0;
		for(int i=0;i<floor;i++)
		{
			for(int j=0;j<ceil;j++)
			{
				if(count == str.length()){
					break;
				}
				array[i][j] = str.charAt(count++);
				if(count == str.length())
				{
					break;
				}
			}
		}
		/*for(int i=0;i<floor;i++)
		{
			for(int j=0;j<ceil;j++)
			{
				System.out.print((char)array[i][j]);
			}
			System.out.println();
		}*/
		for(int j=0;j<ceil;j++)
		{
			for(int i=0;i<floor;i++)
			{
				if((char)array[i][j] == ' ')
				{
					continue;
				}
				else
				{
					list.add((char)array[i][j]);
				}
				//System.out.print((char)array[i][j]);
			}
			//System.out.print(" ");
			list.add(' ');
		}
		//System.out.println(list);
		Iterator iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next());
		}
	}
}
