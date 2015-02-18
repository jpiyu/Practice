import static java.lang.System.*;
import java.util.*;
public class RemovingElementFromTreeset {
	public static void main(String[] args)
	{
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("piyush");
		treeSet.add("joshi");
		treeSet.add("umesh");
		treeSet.add("joshi");
		
		System.out.println(treeSet);
		
		treeSet.remove("piyush");
		System.out.println(treeSet);
		
	}
}
