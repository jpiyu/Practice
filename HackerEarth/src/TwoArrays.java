import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class TwoArrays {
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String[] str = br.readLine().split(" ");
			int size = Integer.parseInt(str[0]);
			int sumToFind = Integer.parseInt(str[1]);
			/*int[] array1 = new int[size];
			int[] array2 = new int[size];*/
			String[] str1 = br.readLine().split(" ");
			String[] str2 = br.readLine().split(" ");
			for(int i=0;i<size;i++)
			{
				//array1[i] = Integer.parseInt(br.readLine());
				list1.add(Integer.parseInt(str1[i]));
			}
			for(int i=0;i<size;i++)
			{
				//array2[i] = Integer.parseInt(br.readLine());
				list2.add(Integer.parseInt(str2[i]));
			}
			Collections.sort(list1);
			Collections.sort(list2);
			for(int i =0;i<size;i++)
			{
				int num = list1.get(i);
				for(int j=0;j<list2.size();j++)
				{
					if(num + list2.get(j) >= sumToFind)
					{
						list2.remove(j);
						break;
					}
				}
			}
			//System.out.println(list2.size());
			if(list2.size() == 0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			list1.clear();
			list2.clear();
			testCases--;
		}
	}
}
