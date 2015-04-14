import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IPAddressValidation {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String regex1 = "(?:2(?:5[0-5]?|[0-4][0-9]?|[0-9])?|[0-1][0-9]{0,2}|[3-9][0-9]?)(?:\\.(?:2(?:5[0-5]?|[0-4][0-9]?|[0-9])?|[0-1][0-9]{0,2}|[3-9][0-9]?)){3}";
		String regex2 = "[0-9a-f]{1,4}(?::[0-9a-f]{1,4}){7}";
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2,Pattern.CASE_INSENSITIVE);
		while(testCases > 0)
		{
			String str = br.readLine();
			if(p1.matcher(str).matches())
			{
				System.out.println("IPv4");
			}
			else if(p2.matcher(str).matches())
			{
				System.out.println("IPv6");
			}
			else
			{
				System.out.println("Neither");
			}
			testCases--;
		}
	}
}
