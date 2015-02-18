import static java.lang.System.*;

import java.io.*;
import java.util.*;

public class GemStones {
	static Set<Character> set = new HashSet<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y = 0;
		String[] array = new String[testCases];
		for(int i=0;i<testCases;i++)
		{
			array[i] = br.readLine();
		}
		int totalStrings = array.length;
		char[][] arrays = new char[testCases][];
		for(int i=0;i<testCases;i++)
		{
			arrays[i] = array[i].toCharArray();
		}
		/*for(int i=0;i<testCases;i++)
		{
			int length = arrays[i].length;
			for(int j=0;j<length;j++)
			{
			System.out.println(arrays[i][j]);
			}
		}*/
		/*for(int i=1;i<testCases;i++)
		{
			int length = arrays[i].length;
			for(int j=0;j<length;j++)
			{
				list.add(arrays[i][j]);
				System.out.println(list);
			}
		}*/
		int element =0,j=0;
		int firstLength = arrays[0].length;
		for(int i=0;i<arrays[0].length;i++)
		{
			set.add(arrays[0][i]);
		}
		Iterator<Character> iter = set.iterator();
		while(iter.hasNext())
		{
			char c = iter.next();
			//System.out.println(c);
			for(j=1;j<testCases;j++)
			{
				//list = Arrays.asList(arrays[j]);
				boolean b = contains(arrays[j], c);
				if(b == true)
				{
					//System.out.println(c);
					continue;
				}
				else if(b == false)
				{
					break;
				}
			}
			//System.out.println(j);
			if(j == testCases)
			{
				element++;
				//System.out.println(element);

			}
			j = 0;
		}
		System.out.println(element);
	}
	static boolean contains(char[] arr,char c)
	{
		for(int k=0;k<arr.length;k++)
		{
			if(c == arr[k])
			{
				return true;
			}
		}
		return false;
	}
}
