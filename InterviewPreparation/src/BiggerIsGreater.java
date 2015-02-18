import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class BiggerIsGreater {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		int y =0;
		String[] array = new String[testCases];
		for(int i=0;i<array.length;i++)
		{
			array[i] = br.readLine();
		}
		boolean status = true;
		int changes =0;
		while(y < testCases)
		{
			String str = array[y];
			status = true;
			changes = 0;
			char c[] = str.toCharArray();
			for(int i=c.length-1;i>=0;i--)
			{
				
				for(int j=i-1;j>=0;j--)
				{
					if(status == true)
					{
					if(c[i] > c[j])
					{
						//System.out.println(c[i] + " " + c[j]);
						char temp = c[j];
						c[j] = c[i];
						c[i] = temp;
						changes++;
						status = false;
					}
					}
				}
			}
			if(changes == 0)
			{
				array[y] = new String("no answer");
			}
			else
			{
			array[y] = new String(c);
			}
			y++;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
