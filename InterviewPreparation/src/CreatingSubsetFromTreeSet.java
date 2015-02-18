import static java.lang.System.*;
import java.util.*;

public class CreatingSubsetFromTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(1);
		tSet.add(5);
		tSet.add(2);
		tSet.add(8);
		tSet.add(3);
		tSet.add(4);

		SortedSet subSet = tSet.subSet(2, 4); // this says that start from 2 and
												// stop one position before 4
												// ...

		System.out.println(subSet);
	}
}
