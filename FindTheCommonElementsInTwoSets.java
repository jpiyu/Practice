package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindTheCommonElementsInTwoSets {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first set");
		String[] str1 = br.readLine().split(" ");
		System.out.println("Enter the second set");
		String[] str2 = br.readLine().split(" ");
		int[] set1 = new int[str1.length];
		int[] set2 = new int[str2.length];
		for(int i=0;i<str1.length;i++)
		{
			set1[i] = Integer.parseInt(str1[i]);
		}
		for(int i=0;i<str2.length;i++)
		{
			set2[i] = Integer.parseInt(str2[i]);
		}
		if(checkDisjoint(set1,set2))
		{
			System.out.println("Both sets have some elements in common");
		}
		else 
		{
			System.out.println("Both sets are disjoint");
		}
	}
	static boolean checkDisjoint(int[] set1,int[] set2)
	{
		Arrays.sort(set1);
		Arrays.sort(set2);
		int i=0,j=0;
		while(i < set1.length && j < set2.length)
		{
			if(set1[i] < set2[j])
			{
				j++;
			}
			else if(set1[i] > set2[j])
			{
				i++;
			}
			else if(set1[i] == set2[j])
			{
				return true;
			}
		}
		return false;
	}
}
