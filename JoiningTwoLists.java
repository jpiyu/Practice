import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class JoiningTwoLists {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		System.out.println("enter the number of elements in list1");
		int elements1 = Integer.parseInt(br.readLine());
		while(elements1 > 0)
		{
			list1.add(Integer.parseInt(br.readLine()));
			elements1--;
		}
		System.out.println("enter the number of elements in list2");
		int elements2 = Integer.parseInt(br.readLine());
		while(elements2 > 0)
		{
			list2.add(Integer.parseInt(br.readLine()));
			elements2--;
		}
		
		System.out.println("Making a new list in which we want to add the elements of the previous lists");
		List<Integer> finalList = new LinkedList<Integer>();
		finalList.addAll(list1);
		finalList.addAll(list2);
		
		Iterator iter = finalList.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
