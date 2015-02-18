import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class XennyAndPowers {
	public static void main(String[] args)
	{
		int temp = 0;
		int powerOfXenny = 0;
		int powerOfSachin = 0;
		String[] str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		str = br.readLine().split(" ");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		powerOfXenny = Integer.parseInt(str[0]);
		powerOfSachin = Integer.parseInt(str[1]);
		temp = powerOfXenny;
		powerOfXenny = powerOfSachin;
		powerOfSachin = temp;
		System.out.println(powerOfXenny + " " + powerOfSachin);
	}
}
