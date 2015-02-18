import java.io.*;
import java.util.*;

public class Anagram {
	static ArrayList<Character> list1 = new ArrayList<>();
	static ArrayList<Character> list2 = new ArrayList<>();
	static HashMap<Character, Integer> map1 = new HashMap<>();
	static HashMap<Character, Integer> map2 = new HashMap<>();
	static Set<Character> set1 = new HashSet<Character>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int iterations = 0;
		String[] array = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			array[i] = br.readLine();
		}
		while (iterations < testCases) {
			String str = array[iterations];
			int length = str.length();
			if (length % 2 != 0) {
				System.out.println(-1);
				iterations++;
				continue;
			} else {
				//int changes = 0;
				int halflength = length / 2;
				for (int i = 0; i < halflength; i++) {
					list1.add(str.charAt(i));
				}
				for (int i = str.length() - 1; i >= halflength; i--) {
					list2.add(str.charAt(i));
				}
				/*for (int i = 0; i < list1.size(); i++) {
					map1.put(list1.get(i), 0);
				}
				for (int i = 0; i < list2.size(); i++) {
					map2.put(list2.get(i), 0);
				}*/
				//System.out.println(map1);
				//System.out.println(map2);
				for(int i=0;i<list1.size();i++)
				{
					int occur =0;
					char c1 = list1.get(i);
					for(int j=0;j<list1.size();j++)
					{
						if(c1 == list1.get(j))
						{
							occur++;
							map1.put(c1,occur);
						}
					}
				}
				for(int i=0;i<list2.size();i++)
				{
					int occur =0;
					char c1 = list2.get(i);
					for(int j=0;j<list2.size();j++)
					{
						if(c1 == list2.get(j))
						{
							occur++;
							map2.put(c1,occur);
						}
					}
				}
				set1 = map1.keySet();
				Iterator<Character> iter = set1.iterator();
				//System.out.println("this is the keyset" + set1);
				//System.out.println(map2);

				int timesInMap1=0,timesInMap2=0;
				int changes =0;
				while(iter.hasNext())
				{
					timesInMap1 = 0;
					timesInMap2 = 0;
					char c = iter.next();
					timesInMap1 = map1.get(c);
					if(map2.containsKey(c))
					{
					timesInMap2 = map2.get(c);
					}
					if(timesInMap1 > timesInMap2)
					{
						changes = changes + (timesInMap1 - timesInMap2);
						//System.out.println(changes);
					}
				}
				System.out.println(changes);
				iterations++;
			}
			//System.out.println(list1);
			//System.out.println(list2);
			//System.out.println(map1);
			
			
			//System.out.println(map2);
			//System.out.println(changes);
			list1.clear();
			list2.clear();
			map1.clear();
			map2.clear();
			set1.clear();
		}
	}
}
