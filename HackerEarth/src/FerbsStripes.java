import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class FerbsStripes {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		boolean status = false;
		while(testCases >0)
		{
			int n = Integer.parseInt(br.readLine());
			String array[] = br.readLine().split(" ");
			//int arr[] = new int[array.length];
			status = false;
			if(array.length != n)
			{
				//System.out.println("bad luck");
				status = true;
				break;
			}
			for(int i=1;i<=array.length-2;i++)
			{
				//System.out.println(array[i]);

				if(Integer.parseInt(array[i]) == Integer.parseInt(array[i-1]) || Integer.parseInt(array[i]) == Integer.parseInt(array[i+1]))
				{
					//System.out.println("bad luck");
					status = true;
					break;
				}
			}
			if(status == true)
			{
				System.out.println("bad luck");
				break;
			}
			System.out.println("can do");
			testCases--;
		}
	}
}
