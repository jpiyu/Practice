import static java.lang.System.*;

import java.util.*;
import java.io.*;
class NextLucky {
	public static void main(String[] args) throws Exception
	{
		ArrayList<Integer> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		System.out.flush();
		while(testCases > 0)
		{
			int num = Integer.parseInt(br.readLine());
			int[] str = convertIntoIntegerArray(num);
			int[] finalArray = new int[str.length];
			list = findLucky(str,list,0,str.length);
			String answer = "";
			for(int i=0;i<list.size();i++)
			{
				answer = answer + list.get(list.size()-1-i);
			}
			System.out.println(answer);
			list.clear();
			testCases--;
		}
	}
	static ArrayList<Integer> findLucky(int[] arr,ArrayList<Integer> list,int i,int length)
	{
		if(i == length)
		{
			return list;
		}
		if(i==length-1)
		{
			if(arr[i] <= 3)
			{/*
				ans[i] = 3;
				findLucky(arr,ans,++i,length);*/
				//System.out.println("1" + arr[i]);
				list.add(3);
			}
			else if(3 < arr[i] && arr[i] < 5)
			{
				/*ans[i] = 5;
				findLucky(arr,ans,++i,length);*/
				//System.out.println("2" + arr[i]);

				list.add(5);
			}
			else if(arr[i] >= 5)
			{
				/*ans[++i] = 3;
				ans[0] = 3;
				findLucky(arr,ans,i,length);*/
				//System.out.println("3" + arr[i]);

				list.add(3);
				list.add(3);
			}
			findLucky(arr,list,++i,length);
		}
		else
		{
			if(arr[i] <= 3)
			{
				//ans[i] = 3;
				//System.out.println("4" + arr[i]);

				list.add(3);
			}
			else if(3 < arr[i] && arr[i] <= 5)
			{
				//ans[i] = 5;
				//System.out.println("5" + arr[i]);

				list.add(3);
			}
			else if(arr[i] > 5)
			{
				//ans[i] = 3;
				//System.out.println("6" + arr[i]);

				list.add(3);
			}
			findLucky(arr,list,++i,length);
		}
		return list;
	}
	static int[] convertIntoIntegerArray(int num)
	{
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while(num > 0)
		{
			int digit = num % 10;
			list2.add(digit);
			num = num/10;
		}
		int array[] = new int[list2.size()];
		for(int u=0;u<list2.size();u++)
		{
			array[u] = list2.get(u);
		}
		list2.clear();
		return array;
	}
}
