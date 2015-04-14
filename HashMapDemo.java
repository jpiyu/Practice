import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class HashMapDemo {
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of elements you want to insert in the hashmap");
		int nElems = Integer.parseInt(br.readLine());
		String key = null;
		int value = 0;
		while(nElems > 0)
		{
			System.out.println("enter the key and value in one row");
			String[] str = br.readLine().split(" ");
			key = str[0];
			value = Integer.parseInt(str[1]);
			map.put(key, value);
			nElems--;
		}
		System.out.println("now printing the elements");
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry pair = (Map.Entry)iter.next();
			System.out.println("the key is -> " + pair.getKey());
			System.out.println("the value is -> " + pair.getValue());
		}
	}
}
