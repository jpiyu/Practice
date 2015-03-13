package Greedy;
import static java.lang.System.*;

import java.io.*;
public class ActivitySelection {
	static String[] str;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start time array");
		str = br.readLine().split(" ");
		int startArray[] = new int[str.length];
		for(int i=0;i<startArray.length;i++)
		{
			startArray[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter the finish time array");
		str = br.readLine().split(" ");
		int finishArray[] = new int[str.length];
		for(int i=0;i<startArray.length;i++)
		{
			finishArray[i] = Integer.parseInt(str[i]);
		}
		//Arrays.sort(finishArray);
		System.out.println("Printing the activities");
		int start = 0;
		//System.out.println(start);
		for(int j=1;j<startArray.length;j++)
		{
			System.out.println(start);
			if(startArray[j] >= finishArray[start])
			{
				start = j;
			}
		}
	}
}
