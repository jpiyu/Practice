import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class CastleStones {
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		boolean status = false;
		while(testCases >0)
		{
			int turns = 0;
			int maxWeight = Integer.parseInt(br.readLine());
			String array[] = br.readLine().split(" ");
			//int length = array[1].length();
			int num = Integer.parseInt(array[0]);
			int arr[] = new int[num];
			for(int i=1;i<array.length;i++)
			{
				arr[i-1] = Integer.parseInt(array[i]);
			}
			
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				list.add(arr[i]);
			}
			
			
			//System.out.println(list);
			
			/*for(int i=0;i<list.size();i++)
			{
				for(int j=i+1;j<list.size();i++)
				{*/
				while(list.size() > 1)
				{
					/*if(list.size()==1)
					{
						turns++;
						continue;
					}*/
					if(list.get(0) + list.get(1) <= maxWeight)
					{
						//System.out.println("1");
						turns++;
						list.remove(0);
						list.remove(1);
						continue;
					}
					else
					{
						//System.out.println("2");
						turns++;
						list.remove(0);
					}
				}
				if(list.size() == 2)
				{
					if(list.get(0) + list.get(1) <= maxWeight)
					{
						//System.out.println("3");
						turns++;
					}
					else
					{
						//System.out.println("4");
						turns = turns+2;
					}
				}
				
				if(list.size() == 1)
				{
					turns++;
				}
				
			System.out.println((turns));
			list.clear();
			testCases--;
		}
	}
}
