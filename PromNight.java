import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class PromNight {
	static ArrayList<Integer> listBoys;
	static ArrayList<Integer> listGirls;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			listBoys = new ArrayList<Integer>();
			listGirls = new ArrayList<Integer>();
			String[] str = br.readLine().split(" ");
			String[] heightsOfBoys = br.readLine().split(" ");
			String[] heightsOfGirls = br.readLine().split(" ");
			int[] arrBoys = new int[heightsOfBoys.length];
			int[] arrGirls = new int[heightsOfGirls.length];
			for(int i=0;i<arrBoys.length;i++)
			{
				listBoys.add(Integer.parseInt(heightsOfBoys[i]));
			}
			for(int j=0;j<arrGirls.length;j++)
			{
				listGirls.add(Integer.parseInt(heightsOfGirls[j]));
			}
			Collections.sort(listBoys,Collections.reverseOrder());
			Collections.sort(listGirls,Collections.reverseOrder());
			
			
			
			Iterator iter = listBoys.iterator();
			while(iter.hasNext())
			{
				int height = (Integer)iter.next();
				System.out.println(height);
				for(int i=0;i<listGirls.size();i++)
				{
					if(listGirls.get(i) < height)
					{
						listGirls.remove(i);
					}
				}
			}
			
			System.out.println(listBoys);
			System.out.println(listGirls);
			
			testCases--;
		}
	}
}
