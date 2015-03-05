import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class FindTheMissingNumberInArithmeticProgression {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the arithmetic progression");
		String[] str = br.readLine().split(" ");
		
		int []array = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(array[i]);
		}
		int commonDifference = 0;
		for(int i=0;i<str.length;i++)
		{
			if(commonDifference != 0)
			{
				break;
			}
			if(str[i].equals(" "))
			{
				continue;
			}
			else if(str[i+1].equals(" "))
			{
				continue;
			}
			else
			{
				commonDifference = Integer.valueOf(str[i+1]) - Integer.valueOf(str[i]);
			}
		}
		System.out.println("comdif" + commonDifference);
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(" "))
			{
			str[i] = String.valueOf(Integer.valueOf(str[i-1]) + commonDifference);
			}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i] + " ");
		}
	}
}
