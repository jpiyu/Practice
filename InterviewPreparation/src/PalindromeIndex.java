import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class PalindromeIndex {
	/*static ArrayList<Character> list1 = new ArrayList<Character>();
	static ArrayList<Character> list2 = new ArrayList<Character>();*/
	static int results[];
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] array = new String[testCases];
		results = new int[testCases];
		/*for(int i=0;i<results.length;i++)
		{
			results[i] = -1;
		}*/
		int y =0;
		while(y < testCases)
		{
			array[y] = br.readLine();
			y++;
		}
		for(int i=0;i<testCases;i++)
		{
			if(isStringPalindrome(array[i]))
			{
				results[i] = -1;
				continue;
			}
			else
			{
				for(int j=0;j<array[i].length();j++)
				{
					if(isPalindrome(array[i],j))
					{
						results[i] = j;
						break;
					}
				}
			}
		}
		for(int i=0;i<results.length;i++)
		{
			System.out.println(results[i]);
		}
	}
	static boolean isPalindrome(String str,int a)
	{
		char arr[] = new char[str.length()];
		int i=0;
		for(i=0;i<a;i++)
		{
			//list1.add(str.toCharArray()[i]);
			arr[i] = str.toCharArray()[i];
		}
		for(int j=a+1;j<str.length();j++)
		{
			//list1.add(str.toCharArray()[i]);
			arr[j-1] = str.toCharArray()[j];
		}
		/*for(int j=0;j<a;j++)
		{
			list2.add(str.toCharArray()[(str.toCharArray().length-1)-j]);
		}
		for(int j=a+1;j<str.length();j++)
		{
			list2.add(str.toCharArray()[(str.toCharArray().length-1)-j]);
		}*/
		String str1 = new String(arr).trim();
		StringBuffer sb = new StringBuffer(str1).reverse();
		//sb = sb.reverse();
		//String str2 = sb.toString();
		/*System.out.println(str1);
		System.out.println(sb);
		*/
		//list1.clear();
		//list2.clear();
		if(str1.compareTo(sb.toString()) == 0)
		{
			return true;
		}
		else
			return false;
	}
	static boolean isStringPalindrome(String str)
	{
		//System.out.println(str);
		StringBuffer sb = new StringBuffer(str).reverse();
		//sb = sb.reverse();
		//sb.toString();
		int j = str.compareTo(sb.toString());
		//System.out.println(j);
		if(j == 0)
		{
			return true;
		}else
			return false;
	}
}
