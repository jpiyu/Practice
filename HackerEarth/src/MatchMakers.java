import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class MatchMakers {
	
	static List<Integer> list1 = new ArrayList<Integer>();
	static List<Integer> list2 = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		
		//int matches = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		
		while(testCases >0)
		{
			int matches = 0;
			int n = Integer.parseInt(br.readLine());
			//String s = br.readLine();
			String girlsHeights[] = br.readLine().split(" ");
			//int girlsHeightsInteger[] = new int[girlsHeights.length];

			//Arrays.sort(girlsHeights);
			for(int i=0;i<girlsHeights.length;i++)
			{
				list1.add(Integer.parseInt(girlsHeights[i]));
			}
			String boysHeights[] = br.readLine().split(" ");
			//int boysHeightsInteger[] = new int[boysHeights.length];
			//Arrays.sort(boysHeights, Collections.reverseOrder());

			for(int i=0;i<boysHeights.length;i++)
			{
				list2.add(Integer.parseInt(boysHeights[i]));
			}
			
			Collections.sort(list1);
			Collections.sort(list2,Collections.reverseOrder());
			for(int i=0;i<n;i++)
			{
				if(list1.get(i) % list2.get(i) == 0 || list2.get(i) % list1.get(i) == 0)
				{
					matches++;
				}
			}
			
			list1.clear();
			list2.clear();
			System.out.println(matches);
			testCases--;
		}
	}
}
