import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class XennyAndUniqueness {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<String>();
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String str = br.readLine();
			set.add(str);
			testCases--;
		}
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
