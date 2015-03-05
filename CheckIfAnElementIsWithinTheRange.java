import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CheckIfAnElementIsWithinTheRange {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array");
		String[] str = br.readLine().split(" ");
		int [] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println("enter the width");
		int k = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				System.out.println("the element is in the specified width");
				return;
			}
			set.add(arr[i]);
			set.remove(i-k);
		}
		System.out.println("the element is not in the specified width");
	}
}
