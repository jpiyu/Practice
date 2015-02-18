import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class ShinchanAndGirlfriend {
	public static void main(String[] args) throws Exception
	{
		List<String> list = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			int queries = Integer.parseInt(br.readLine());
			list.clear();
			while(queries >0)
			{
				String[] lineArray = br.readLine().split(" ");
				if(Integer.parseInt(lineArray[0]) == 1)
				{
					list.add(lineArray[1]);
				}
				else if(Integer.parseInt(lineArray[0]) == 2)
				{
					if(list.contains(lineArray[1]))
					{
					int positionFromStart = list.indexOf(lineArray[1]);
					int positionFromEnd = list.lastIndexOf(lineArray[1]);
					System.out.println(positionFromStart+1 + " " + (positionFromEnd+1));
					}
					else
					{
						System.out.println(-1 + " " + -1);
					}
				}
				queries--;
			}
			testCases--;
		}
	}
}
