import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MarkAndToys {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int noOfToys = Integer.parseInt(str[0]);
		long totalAmount = Long.parseLong(str[1]);
		String[] prices = br.readLine().split(" ");
		long[] priceArray = new long[prices.length];
		for(int i=0;i<prices.length;i++)
		{
			priceArray[i] = Long.parseLong(prices[i]);
		}
		Arrays.sort(priceArray);
		int items = 0;
		//while(totalAmount > 0)
		//{
			for(int i=0;i<priceArray.length;i++)
			{
				if(priceArray[i] <= totalAmount)
				{
					items++;
					totalAmount = totalAmount - priceArray[i];
				}
				else
				{
					continue;
				}
			}
		//}
		System.out.println(items);
	}
}
