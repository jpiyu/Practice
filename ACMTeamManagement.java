import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ACMTeamManagement {
	static HashMap<Integer,Integer> map;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String[] str = br.readLine().split(" ");
			int totalStudents = Integer.parseInt(str[0]);
			int studentsInOneGroup = Integer.parseInt(str[1]);
			int totalGroups = totalStudents/studentsInOneGroup;
			map = new HashMap<Integer,Integer>();
			boolean status = true;
			//map.put(6, 1);
			//System.out.println(map.get(6));
			for(int i=0;i<totalStudents;i++)
			{
				String name = br.readLine();
				//int length = name.length();
				//int count = map.get(length);
				//System.out.println(count);
				if(!map.containsKey(name.length()))
				{
					map.put(name.length(), 1);					
				}
				else
				{
					map.put(name.length(), map.get(name.length())+1);
				}
			}
			//System.out.println(map);
			int size = map.size();
			Iterator iter = map.entrySet().iterator();
			while(iter.hasNext())
			{
				Map.Entry pair = (Map.Entry)iter.next();
				if((Integer)pair.getValue() != studentsInOneGroup)
				{
					status = false;
				}
				else
				{
					status = true;
				}
			}
			if(size == totalGroups && status == true)
			{
				System.out.println("Possible");
			}
			else
			{
				System.out.println("Not possible");
			}
			map.clear();
			testCases--;
		}
	}
}
