import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class CutTheSticks {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int arr[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int listSize = list.size();
		//System.out.println(listSize);
		while(listSize > 0)
		{
			System.out.println(listSize);
			listSize =0;
			
			Iterator iter = list.iterator();
			int min = Collections.min(list);
			//System.out.println(min);
			while(iter.hasNext())
			{
				int i = (Integer)iter.next();
				int index = list.indexOf(i);
				i = i - min;
				list.set(index, i);
			}
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i) > 0)
				{
					listSize++;
				}
			}
			//System.out.println(list);
		}
	}
}
