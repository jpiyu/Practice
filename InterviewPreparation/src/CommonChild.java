import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class CommonChild {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[2];
		int length;
		for(int i=0;i<2;i++)
		{
			array[i] = br.readLine();
		}
		length = array[1].length();
		int checkLength = length;
		String subString = "";
		while(checkLength > 0)
		{
			for(int i=0;i<length;i++)
			{
				if(i+checkLength <= length)
				{
					subString = array[1].substring(i,i+checkLength);
					
				}
			}
			checkLength--;
		}
	}
}
