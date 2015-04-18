import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class TaskForOZ {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String str = br.readLine();
			int[] arr = new int[str.length()];
			int[] arr2 = new int[str.length()];
			int numberOfZs = 0;
			for(int i=0;i<arr.length;i++)
			{
				char c = str.charAt(i);
				if(c == 'Z')
				{
					numberOfZs++;
					arr[i] = 0;
				}
				else if(c ==  'O')
				{
					arr[i] = numberOfZs;
				}
			}
			int answer1 = 0;
			for(int j=0;j<arr.length;j++)
			{
				answer1 = answer1 + arr[j];
			}
			int numberOfOs = 0;
			for(int i=0;i<str.length();i++)
			{
				char c = str.charAt(i);
				if(c == 'O')
				{
					numberOfOs++;
					arr[i] = 0;
				}
				else
				{
					arr2[i] = numberOfOs;
				}
			}
			int answer2 = 0;
			for(int j=0;j<arr2.length;j++)
			{
				answer2 = answer2 + arr2[j];
			}
			System.out.println((answer1 < answer2) ? answer1 : answer2);
			testCases--;
		}
	}
}
