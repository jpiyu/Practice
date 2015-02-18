import java.util.*;
public class CheckingIterator {
	public static void main(String[] arg)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("piyush");
		list.add("joshi");
		list.add("umesh");
		list.add("joshi");
		Iterator<String> iter = list.iterator();   // the iterator should catch the same generic type as the iterator() method is returning
		while(iter.hasNext())
			
		{
			System.out.println(iter.next());
		}
		
	}
}
