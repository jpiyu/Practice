import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HackerRankTweets {
	public static void main(String[] args) throws Exception
	{
		int finalCount = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		Pattern p = Pattern.compile("[#@]?[Hh][Aa][Cc][Kk][Ee][Rr][Rr][Aa][Nn][Kk]");
		while(testCases > 0)
		{
			String[] str = br.readLine().split(" ");
			for(int i=0;i<str.length;i++)
			{
				String temp = str[i];
				Matcher m = p.matcher(temp);
				if(m.matches())
				{
					finalCount++;
					break;
				}
				
			}

			testCases--;
		}
		System.out.println(finalCount);
	}
}
