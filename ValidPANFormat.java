import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidPANFormat {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String str = "[A-Z]{5}[0-9]{4}[A-Z]";
		Pattern p = Pattern.compile(str);
		while(testCases > 0)
		{
			String stringToMatch = br.readLine();
			Matcher m = p.matcher(stringToMatch);
			if(m.matches())
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			testCases--;
		}
	}
}
