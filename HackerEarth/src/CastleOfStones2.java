import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class CastleOfStones2 {
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		//boolean status = false;
		 Comparator<Integer> comparator = new Comparator<Integer>() {

		        @Override
		        public int compare(Integer o1, Integer o2) {
		            return o2.compareTo(o1);
		        }
		    };
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
			
			//Arrays.sort(arr, Collections.reverseOrder());
			for(int i=0;i<arr.length;i++)
			{
				list.add(arr[i]);
			}
			
			//Collections.sort(list, comparator);
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
					boolean status = false;
					int num1 = list.get(0);
					int diff = maxWeight - num1;
					int finalnum = Integer.MIN_VALUE;
					for(int i=1;i<list.size();i++)
					{
						int diff2 = Integer.MIN_VALUE;
						int num2= list.get(i);
						if(num1-num2 < diff2)
						{
							finalnum = list.get(i);
							status = true;
						}
					}
					if(status == true)
					{
						turns++;
					list.remove(0);
					list.remove(list.indexOf(finalnum));
					}
					else
					{
						turns++;
						list.remove(0);
					}
					/*if(list.get(0) + list.get(1) <= maxWeight)
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
					}*/
				}
				if(list.size() == 2)
				{
					if(list.get(0) + list.get(1) <= maxWeight)
					{
						System.out.println("here3");
						turns++;
						continue;
					}
					else
					{
						System.out.println("here4");
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
