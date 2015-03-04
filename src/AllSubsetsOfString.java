/**
 * wrong
 */

import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AllSubsetsOfString {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			char c[] = new char[i+1];
			c = str.substring(0, i+1).toCharArray();
			/*for(int j=0;j<c.length;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();*/
			int length = c.length;
			permute(c,0,length-1);
		}
	}
	static void permute(char[] ch,int i,int n)
	{
		if(i == n)
		{
			print(ch);
		}
		else
		{
			for(int j=i;j<=n;j++)
			{
				swap(ch,i,j);
				permute(ch,i+1,n);
				swap(ch,i,j);
			}
		}
	}
	static void print(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	static void swap(char[] ch,int index1,int index2)
	{
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
	}
}
