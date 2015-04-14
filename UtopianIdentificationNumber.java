import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UtopianIdentificationNumber {
	public static void main(String[] arsg) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String regex = "[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}";
		Pattern p = Pattern.compile(regex);
		while(testCases > 0)
		{
			String str = br.readLine();
			Matcher m = p.matcher(str);
			if(m.matches())
			{
				System.out.println("VALID");
			}
			else
			{
				System.out.println("INVALID");
			}
			testCases--;
		}
	}
	
}
