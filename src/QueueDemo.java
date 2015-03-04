import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class QueueDemo {
	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add (3);
		Iterator iter = queue.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
