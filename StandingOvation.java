import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class StandingOvation {
	static int[] arr;
	static String[] str;
	static int friendsToBring;
	static int standingPeople;
	public static void main(String[] args) throws Exception
	{
		File fin = new File("A-small-attempt9.in");
		File fout = new File("A-small-attempt891.out");
		BufferedReader br = new BufferedReader(new FileReader(fin));
		BufferedWriter br2 = new BufferedWriter(new FileWriter(fout));
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
			standingPeople = arr[0];
			for(int j=1;j<arr.length;j++)
			{
				if(standingPeople < j && (arr[j] != 0))
				{
					if((arr[j]-standingPeople) < 0)
					{
						friendsToBring = friendsToBring + 0;
					}
					else
					{
					friendsToBring = friendsToBring + (j-standingPeople);
					}
					standingPeople = standingPeople + friendsToBring + arr[j];
					//friendsToBring += (j-standingPeople);
				}
				else
				{
					standingPeople = standingPeople + arr[j];
				}
			}

			br2.write("Case #" + (y+1) + ": " + friendsToBring);
			br2.newLine();
			y++;
		}
		br2.close();
		br.close();
	}
}
