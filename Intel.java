import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class Intel {
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			int changes = 0;
			String str = br.readLine();
			for(int i=0;i<str.length();i++)
			{
				char c = str.charAt(i);
				if(map.containsKey(c))
				{
					//System.out.println("here");
					//int count = map.get(c);
					//map.remove(c);
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			Iterator it = map.entrySet().iterator();
			int oneCount = 0;
			while(it.hasNext())
			{
				Map.Entry pair = (Map.Entry)it.next();
				if((Integer)pair.getValue()%2 == 1)
				{
					oneCount++;
				}
			}
			int temp = 0;
			if(oneCount == 1)
			{
				changes = 0;
			}
			else
			{
				if(oneCount > 1)
				{
					changes = oneCount-1;
				}
				else if(map.size() == str.length())
				{
					changes = oneCount - 1;
				}
				else
				{
					int h = 0;
					Iterator iter = map.entrySet().iterator();
					while(iter.hasNext())
					{
						Map.Entry pair = (Map.Entry)iter.next();
						 h = (Integer)pair.getValue();
						if((h%2 == 1) && (h != 1))
						{
							temp++;

						}
					}
					changes = temp;
				}
			}
			System.out.println(changes);
			map.clear();
			testCases--;
		}
	}
}
