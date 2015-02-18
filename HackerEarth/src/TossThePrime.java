import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class TossThePrime {
	static List<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = 0;
		try
		{
			testCases = Integer.parseInt(br.readLine());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		while(testCases > 0)
		{
			String[] str = null;
			try
			{
				str =  br.readLine().split(" ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			int lowerLimit = Integer.parseInt(str[0]);
			int upperLimit = Integer.parseInt(str[1]);
			int x = Integer.parseInt(str[2]);
			for(int i=lowerLimit+1;i<upperLimit;i++)
			{
				if(isPrime(i))
				{
					list.add(i);
				}
			}
			//System.out.println(list);
			String arr[] = new String[x];
			//System.out.println(arr.length);
			for(int i=0;i<x;i++)
			{
				try
				{
					arr[i] = (String)br.readLine();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			//System.out.println(list.size());
			//String arr2[] = new String[list.size()];
			int j = 0;
			int count = 0;
			for(int i=0;i<list.size();i++)
			{
				//arr2[i] = arr[j];
				if(arr[j].equals("H"))
				{
					count++;
				}
				j++;
				if(j == arr.length)
				{
					j = 0;
				}
			}
			/*for(int i=0;i<arr2.length;i++)
			{
				//System.out.println(arr2[i]);
				if(arr2[i].equals("H"))
				{
					count++;
				}
			}*/
			System.out.println(count);
			list.clear();
			testCases--;
		}
	}
	public static boolean isPrime(int i)
	{
		//boolean status = true;
		for(int k=2;k<=i/2;k++)
		{
			if(i%k == 0)
			{
				//status = false;
				return false;
			}
		}
		return true;
	}
}
