import static java.lang.System.*;

import java.io.*;
import java.util.*;	
public class KaranAndEvenNumbers {
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		int num = 0;
		while(num != -1)
		{
			num = s.nextInt();
			if((num % 2) == 0)
			{
				list.add(num);
			}
		}
		for(Integer i : list)
		{
			System.out.println(i);
		}
	}
}
