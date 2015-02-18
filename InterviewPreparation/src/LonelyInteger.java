import java.util.*;
import java.io.*;
public class LonelyInteger {
	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception
	{
		int answer =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int arr[] = new int[array.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(array[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			int occur =0;
			int num = (Integer)iter.next();
			for(int i=0;i<list.size();i++)
			{
				if(num == list.get(i))
				{
					occur++;
					map.put(num, occur);
					
				}
			}
			if(occur == 1)
			{
				answer = num;
			}
		}
		System.out.println(answer);
	}
}
