import static java.lang.System.*;

import java.io.*;
public class DateWithAvni {
	public static void main(String[] args) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] array = new String[testCases];
		int y=0;
		while(y<testCases)
		{
			array[y] = br.readLine();
			System.out.println(slapOrKiss(array[y]));
			y++;
		}
	}
	static String slapOrKiss(String str)
	{
		int count = 0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) != str.charAt(i-1))
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count == str.length()-1)
		{
			return "KISS";
		}
		return "SLAP";
	}
}
