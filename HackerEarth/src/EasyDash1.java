import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;


public class EasyDash1 {
	static LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		char[] arr = new char[set.size()];
		Object[] obj = set.toArray();
		//String string = Arrays.copyOfRange(obj,obj.length,String.class);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (char)obj[i];
		}
		String finalString = new String(arr);
		System.out.println(finalString);
	}
}
