import java.io.*;
import java.util.*;

public class MirrorOfMahatmaGandhi {
	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] array = new String[testCases];
		int y=0;
		while(y<testCases)
		{
			array[y] = br.readLine();
			System.out.println(luckyOrNot(array[y]));
			y++;
		}
	}
	static String luckyOrNot(String str)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			/*if(str.charAt(i) == str.charAt(str.length()-1-i))
			{
				count++;
				continue;
			}*/
			if(str.charAt(i) == '0' || str.charAt(str.length()-1-i) == '8')
			{
				count++;
				continue;
			}
			else if(str.charAt(i) == '1' || str.charAt(str.length()-1-i) == '1')
			{
				count++;
			}
			else if(str.charAt(i) == '1' || str.charAt(str.length()-1-i) == '8')
			{
				count++;
			}
		}
		if(count == str.length())
		{
			return "YES";
		}
		return "NO";
	}
}
