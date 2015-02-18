import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class DiffuseTheBomb {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		boolean status = false;
		while(testCases >0)
		{
			//int n = Integer.parseInt(br.readLine());
			String array[] = br.readLine().split(" ");
			int length = array[1].length();
			int num = Integer.parseInt(array[1]);
			//int arr[] = new int[array.length];
			status = false;
			for(int i=0;i<=array[0].length()-length;i++)
			{
				String sub = array[0].substring(i, i+length);
				System.out.println((Integer.parseInt(sub)*num));
			}
			testCases--;
		}
	}
}
