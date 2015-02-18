import java.util.*;

import java.io.*;

public class IsFibo {
	static java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
	static java.util.LinkedList<Integer> list2;
	// static int numberOfDeletions;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		long[] finalArray = new long[testCases];
		int[] array = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		finalArray = new long[testCases];
		int j=0;
		while(j < testCases)
		{
			int range = array[j];
			int number = range;
			list2 = getFibonacciSeries(range*range);
			//System.out.println(list2);
			if(checkIfFibonacciNumOrNot(number))
			{
				System.out.println("IsFibo");
			}
			else
			{
				System.out.println("IsNotFibo");
			}
			list2.clear();
			j++;
		}
	}
	static java.util.LinkedList<Integer> getFibonacciSeries(int range)
	{
		int first = 0;
		int second =1;
		int next;
		list.clear();
		list.add(first);
		list.add(second);
		range = range -2;
		while(range >0)
		{
			next = first + second;
			first = second;
			second = next;
			list.add(next);
			//System.out.println(next);
			range--;
		}
		//System.out.println(list);
		return list;
	}
	static boolean checkIfFibonacciNumOrNot(int number)
	{
		int index = 0;
		while(index < (list2.size()-1))
		{
			int num1 = list2.get(index);
			int num2 = list2.get(index+1);
			int sum = 0;
			sum = num1 + num2;
			if(number == 3)
			{
				return true;
			}
			if(sum == number)
			{
				return true;
			}
			index++;
		}
		return false;
	}
}