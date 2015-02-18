import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class VadaPavList {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<String>();
		for(int i=0;i<n;i++)
		{
			String str = br.readLine();
			//if(!set.contains(str))
			//{
			set.add(str);
			//}
		}
		Iterator iter = set.iterator();
		System.out.println(set.size());
		//Collections.sort(set);
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
