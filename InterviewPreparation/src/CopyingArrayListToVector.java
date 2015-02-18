import static java.lang.System.*;
import java.util.*;
public class CopyingArrayListToVector {
	public static void main(String[] args){
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		List<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		
		Collections.copy(vector,arrayList);
		for(String str : vector)
		{
			System.out.println(str);
		}
	}
}
