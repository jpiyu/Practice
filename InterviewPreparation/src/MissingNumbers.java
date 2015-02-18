import static java.lang.System.*;

import java.io.*;
import java.util.*;

public class MissingNumbers {
	static java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size1 = Integer.parseInt(br.readLine());
		String[] list1 = br.readLine().split(" ");
		int arr1[] = new int[list1.length];
		for (int i = 0; i < list1.length; i++) {
			arr1[i] = Integer.parseInt(list1[i]);
		}
		int size2 = Integer.parseInt(br.readLine());
		String[] list2 = br.readLine().split(" ");
		int arr2[] = new int[list2.length];
		for (int i = 0; i < list2.length; i++) {
			arr2[i] = Integer.parseInt(list2[i]);
		}
		int occur1 = 0,occur2=0;
		//int difference = 0;
		//int index=0;
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<arr2.length;i++)
		{
			s.add(arr2[i]);
		}
		//System.out.println(s);
		Iterator iter = s.iterator();
		while(iter.hasNext())
		{
			occur1 = 0;
			occur2 = 0;
			int num = (Integer)iter.next();
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j] == num)
				{
					occur2++;
				}
			}
			for(int k=0;k<arr1.length;k++)
			{
				if(arr1[k] == num)
				{
					occur1++;
				}
			}
			if(occur2 > occur1)
			{
				/*difference = occur2 - occur1;
				while(difference > 0)
				{
					System.out.println(num);
					System.out.println(difference);
					System.out.println(index);
					results[index] = num;
					difference--;
					index++;
				}
				*/
				list.add(num);
				}
		}
		Iterator<Integer> it = list.iterator();
		int[] results = new int[list.size()];
		int index = 0;
		while(it.hasNext()){
			results[index] = (Integer)it.next(); 
			index++;
		}
		Arrays.sort(results);
		for(int i=0;i<index;i++)
		{
			System.out.print(results[i] + " ");
		}
	}

}
