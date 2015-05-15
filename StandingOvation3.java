import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class StandingOvation3{
	static int[] arr;
	static String[] str;
	static int friendsToBring;
	static int standingPeople;
	public static void main(String[] args) throws Exception
	{
		File fin = new File("A-small-attempt3.in");
		File fout = new File("A-small-attempt3.out");
		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		BufferedWriter br2 = new BufferedWriter(new OutputStreamWriter(fos));
		int testCases = Integer.parseInt(br.readLine());
		int y =0;
		while(y < testCases)
		{
			friendsToBring = 0;
			standingPeople = 0;
			String[] array = br.readLine().split(" ");
			int maxShy = Integer.parseInt(array[0]);
			arr = new int[maxShy+1];
			String st = array[1];
			for(int i=0;i<st.length();i++)
			{
				arr[i] = (int)(st.charAt(i)-'0');
			}
			/*for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] + " ");
			}
			*/
			int needed = 0;
			int available = 0;
			standingPeople = arr[0];
			for(int j=arr.length-1;j>0;j--)
			{
				needed = j;
				available = arr[j-1];
				if(available < needed)
				{
					friendsToBring = friendsToBring + (needed-available);
					arr[j-1] = needed-available;
				}
			}

			br2.write("Case #" + (y+1) + ": " + friendsToBring);
			br2.newLine();
			y++;
		}
		br2.close();
		fos.close();
		br.close();
		fis.close();
	}
}
