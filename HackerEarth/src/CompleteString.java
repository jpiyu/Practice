import static java.lang.System.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.*;
public class CompleteString {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(br.readLine());
		String array[] = new String[testCases];
		String result[] =  new String[testCases];
		int y = 0;
		boolean status;
		while(y<testCases)
		{
			array[y] = br.readLine();
			y++;
		}
		
		for(int i=0;i<testCases;i++)
		{
			String str = array[i];
			for(int j=97;j<=122;j++)
			{
				if(!contains(str,(char)j))
				{
					result[i] = "NO";
				}
				else
				{
					result[i] = "YES";
				}
			}
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	public static boolean contains(String s,char c)
	{
		int h = 0;
		int occur = 0;
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(c);
			if(s.charAt(i) == c)
			{
				System.out.println(occur++);
				h++;
			}
		}
		if(h == 0)
		{
			return false;
		}
		else
		{
		return true;
		}
	}
}
