import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LittleAshishAndHisWife { 
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases > 0)
		{
			String[] line1 = br.readLine().split(" ");
			int noOfDresses = Integer.parseInt(line1[0]);
			int dressesToSelect = Integer.parseInt(line1[1]);
			String[] line2 = br.readLine().split(" ");
			int[] prices = new int[line2.length];
			for(int i=0;i<prices.length;i++)
			{
				prices[i] = Integer.parseInt(line2[i]);
			}
			int distinctClothes = findDistinct(prices);
			//System.out.println(distinctClothes);
			if(distinctClothes > dressesToSelect)
			{
				System.out.println("Lame Husband");
			}
			else if(distinctClothes == dressesToSelect)
			{
				System.out.println("Perfect Husband");
			}
			else
			{
				System.out.println("Bad Husband");
			}
			testCases--;
		}
	}
	static int findDistinct(int[] prices)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<prices.length;i++)
		{
			if(!map.containsKey(prices[i]))
			{
				map.put(prices[i], 1);
			}
			else
			{
				map.put(prices[i], map.get(prices[i]) + 1);
			}
		}
		return map.size();
	}
}
