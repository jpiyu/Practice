import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class BestBrowser {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String[] array = new String[testCases];
		String[] solutionArray = new String[testCases];
		int y=0;
		StringBuffer sb = new StringBuffer();
				String str = sb.toString();
		for(int i=0;i<testCases;i++)
		{
			try
			{
			array[i] = br.readLine();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		while(y < testCases)
		{
			int number = 0;
			//String str = array[y];
			int actualLength = str.length();
			int lastIndex = str.lastIndexOf(".");
			String str2 = str.substring(4,lastIndex);
			System.out.println(str2);
			for(int i=0;i<str2.length();i++)
			{
				char c = str2.charAt(i);
				if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
				{
					continue;
				}
				else
					number++;
			}
			solutionArray[y] = String.valueOf(number+4) + "/" + String.valueOf(actualLength);
			y++;
		}
		for(int i=0;i<testCases;i++)
		{
			System.out.println(solutionArray[i]);
		}
	}
}
