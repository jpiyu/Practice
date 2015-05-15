import static java.lang.System.*;

import java.io.*;
import java.util.*;	
public class KaranAndEvenNumbers {
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(br.readLine() != "-1")
		{
			list.add(Integer.parseInt(br.readLine()));
		}
		for(int i=0;i<list.size();i++)
		{
			int num = list.get(i);
			if(num % 2 != 0)
			{
				list.remove(num);
			}
		}
		for(int j=0;j<list.size();j++)
		{
			System.out.println(list.get(j));
		}
	}
}
