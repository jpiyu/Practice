import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class GameOfStrings {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int testCases = Integer.parseInt(br.readLine());
		//while(testCases > 0)
		{
			String[] strings = br.readLine().split(" ");
			int finalLength = 0;
			//int increment = 0;
			int length1 = strings[0].length();
			int length2 = strings[1].length();
			//int i = 0;
			for(int increment = 1;increment<length1;increment++)
			{
				//System.out.println("increment" + increment);
				//int keepingTrack = i;
				/*
				if(increment+i==length1-1)
				{
					i = keepingTrack++;
					increment = 0;
				}
				*/
				/*String temp = strings[0].substring(i,(i+increment));
				System.out.println(temp);
				System.out.println("i :" + " " + i);
				System.out.println("i+increment : " + " " + (i+increment));
				*/
				for(int i=0;i<(length1);i++)
				{
					if((i+increment) > length1)
					{
						continue;
					}
					String temp = strings[0].substring(i,i+increment);
					System.out.println(temp);
					if(containsVowel(temp))
					{
						continue;
					}
					if(strings[1].contains(temp))
					{
						//System.out.println(temp + " " + "YES");
						//System.exit(1);
						if(temp.length() > finalLength)
						{
							finalLength = temp.length();
						}
					}
				}
			}
			System.out.println(finalLength);
			//testCases--;
		}
	}
	public static boolean containsVowel(String str)
	{
		if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
		{
			return true;
		}
		return false;
	}
}
