package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindingPowers {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number and the limit upto which you want to find out the powers");
		String[] str = br.readLine().split(" ");
		int base = Integer.parseInt(str[0]);
		int power = Integer.parseInt(str[1]);
		int values[] = new int[power];
		values[0] = base;
		for(int i=1;i<power;i++)
		{
			values[i] = values[i-1]+base;
		}
		for(int i=0;i<power;i++)
		{
			System.out.println(values[i]);
		}
	}
}
