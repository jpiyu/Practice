import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LadderToHeaven {
	static List<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			int total = 0;
			int limit = Integer.parseInt(br.readLine());
			int first = 1;
			int second = 2;
			list.add(first);
			list.add(second);
			int num = 0;
			while ((first + second) <= limit)
			{
				num = first + second;
				list.add(num);
				first = second;
				second = num;
			}
			//System.out.println(list);
			Iterator<Integer> iter = list.iterator();
			while(iter.hasNext())
			{
				int tempNum = (Integer)iter.next();
				if(tempNum%2 == 0)
				{
					total = total + tempNum;
				}
			}
			System.out.println(total);
			list.clear();
			testCases--;
		}
	}
}
