import static java.lang.System.*;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class ConnectingTownsViaBigIntegerClass {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of testcases");
		int testCases = Integer.parseInt(br.readLine());
		BigInteger fac = new BigInteger("1");
		while(testCases > 0)
		{
			System.out.println("enter the number of which you want to find out the factorial");
			int number = Integer.parseInt(br.readLine());
			for(int i=number;i>0;i--)
			{
				fac = fac.multiply(new BigInteger(i + ""));
				System.out.println(fac);
			}
			System.out.println(fac.toString());
			testCases--;
		}
	}
}
