import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class MaximizingXOR {
	static int[] result;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		String str1 = Integer.toBinaryString(num1);
		String str2 =  Integer.toBinaryString(num2);
		System.out.println(str1 + "\n" + str2);
		int length = 0;
		if(str1.length() < str2.length())
		{
			length = str1.length();
			result = new int[str2.length()];
			for(int i=0;i<length;i++)
			{
				char c1 = str1.charAt(length-1-i);
				char c2 = str2.charAt((str2.length()-1) - i);
				if((c1 == '0' && c2 == '0') || (c1 == '1' && c2 == '1'))
				{
					result[i] = '0';
				}
				else
				{
					result[i] = '1';
				}
			}
			for(int j=1;j<str2.length()-str1.length();j++)
			{
				result[str1.length()+j] = str2.charAt(str1.length()+j);
			}
		}
		else 
		{
			length = str2.length();
			result = new int[str1.length()];
			for(int i=0;i<length;i++)
			{
				char c1 = str2.charAt(length-1-i);
				char c2 = str1.charAt((str1.length()-1)-i);
				if((c1 == '0' && c2 == '0') || (c1 == '1' && c2 == '1'))
				{
					result[i] = '0';
				}
				else
				{
					result[i] = '1';
				}
			}
			for(int j=1;j<str1.length()-str2.length();j++)
			{
				result[str2.length()+j] = str1.charAt(str2.length()+j);
			}			
		}
		for(int k=0;k<result.length;k++)
		{
			System.out.print((char)result[k]);
		}
	}
		
}

