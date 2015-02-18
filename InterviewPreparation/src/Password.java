// this program can be made only for odd length string set //

import java.io.*;
import java.util.*;
public class Password {
	public static void main(String[] args) throws Exception
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int possiblePasswords = Integer.parseInt(br.readLine());
		String[] str = new String[possiblePasswords];
		int y = 0;
		int length1 = 0,halfLength1 = 0,length2=0,halfLength2=0;
		while( y < possiblePasswords)
		{
			str[y] = br.readLine();
			y++;
		}
		for(int i=0;i<str.length;i++)
		{
			String string1 = str[i];
			//System.out.println(string1);
			length1 = string1.length();
			//System.out.println(length1);
			if(length1%2 == 0)
			{
				halfLength1 = length1/2;
			}
			else if(length1%2 == 1)
			{
				halfLength1 = length1/2 + 1;
			}
			for(int j=0;j<str.length;j++)
			{
				if(i == j)
				{
					continue;
				}
				String string2 = str[j];
				//System.out.println(string2);
				length2 = string2.length();
				if(length2%2 == 0)
				{
					halfLength2 = length2/2;
				}
				else if(length2%2 == 1)
				{
					halfLength2 = length2/2 + 1;
				}	
				/*System.out.println("1");
				System.out.println(string1.charAt(halfLength1));
				System.out.println(string2.charAt(halfLength2));*/
				if(string1.charAt(halfLength1-1) == string2.charAt(halfLength2-1))
				{
					//System.out.println("inside if block");
					boolean status = checkPalindrome(string1,string2);
					if(status == true)
					{
						System.out.println(string1.length() + " " + string1.charAt(halfLength1-1));
						return;
					}
				}
			}
		}
		//System.out.println("leaving main method");
	}
	static boolean checkPalindrome(String str1,String str2)
	{
		//System.out.println("inside function");
		int y = 0;
		int count = 0;
		while(y < str1.length())
		{
			if(str1.charAt(y) == str2.charAt((str2.length()-1) - y))
			{
				//System.out.println("checking ifff");
				count++;
			}
			y++;
		}
		if(count == y)
		{
			return true;
		}
		return false;

	}
}
