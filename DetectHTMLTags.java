import static java.lang.System.*;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DetectHTMLTags {
	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] artgs) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fragments = Integer.parseInt(br.readLine());
		String regexOpeningTag = "[<][a-z]*[>]?";
		//String regexClosingTag = "[<][/][a-z]*[>]";
		//Pattern p2 = Pattern.compile(regexClosingTag);
		String regexForAnchorTag = "";
		Pattern p1 = Pattern.compile(regexOpeningTag);
		Pattern pAnchor = Pattern.compile(regexForAnchorTag);
		boolean foundStartingTag = false;
		boolean foundClosingTag = false;
		while(fragments > 0)
		{
			foundStartingTag = false;
			foundClosingTag = true;
			String[] str = br.readLine().split(" ");
			for(int i=0;i<str.length;i++)
			{
				//Matcher m2 = p2.matcher(str[i]);
				Matcher m1 = p1.matcher(str[i]);
				if(m1.matches())
				{
					list.add(str[i]);
				}
			}
			list.clear();
			fragments--;
		}
	}
}
