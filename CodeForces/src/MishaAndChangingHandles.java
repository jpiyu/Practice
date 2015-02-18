import static java.lang.System.*;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class MishaAndChangingHandles {
	static HashMap<String,String> map = new HashMap<String,String>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++)
		{
			String[] str = br.readLine().split(" ");
			//map.put(str[0], str[1]);
	        for (Entry<String, String> entry : map.entrySet()) {
	            if (entry.getValue().equals(str[0])) {
	                //System.out.println(entry.getKey());
	            	String copy = entry.getKey();
	            	map.remove(str[1]);
	            	map.put(copy, str[1]);
	            }
	        
	        }

		}
	}
}
