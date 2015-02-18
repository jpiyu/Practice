import static java.lang.System.*;
import java.util.*;
public class GettingTailSetFromTreeSet {
	public static void main(String[] args)
	{
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("10");
		tSet.add("1");
		tSet.add("90");
		tSet.add("40");
		tSet.add("30");
		tSet.add("70");
		tSet.add("60");
		tSet.add("50");
		
		System.out.println(tSet);
		
		SortedSet tailSet = tSet.tailSet("40");
		
		System.out.println(tailSet);
	}
}
