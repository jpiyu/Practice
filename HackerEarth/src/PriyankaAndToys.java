import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class PriyankaAndToys {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		long[] priceArray = new long[size];
		String[] str = br.readLine().split(" ");
		for(int i=0;i<str.length;i++)
		{
			priceArray[i] = Long.parseLong(str[i]);
		}
		Arrays.sort(priceArray);
		int items = 1;
		long prev = priceArray[0];
		for(int i=0;i<priceArray.length;i++)
		{
			if(priceArray[i]- prev > 4)
			{
				prev = priceArray[i];
				items++;
			}
		}
		
		//another crappy logic 
		/*for(int i=0;i<priceArray.length;i++)
		{
			long num = priceArray[i];
			long start = num;
			long end = num+5;
			items = items + 1;
			System.out.println("start" + start);
			System.out.println("end" + end);
			System.out.println("items" + items);
			
			for(int j=i+1;j<priceArray.length;j++)
			{
				if(start <= priceArray[i] && priceArray[i] <= end)
				{
					i++;
					//items++;
				}
			}
			int j=i+1;
			if(j >= priceArray.length)
			{
				break;
			}
			while((start <= priceArray[j] && priceArray[j] <= end))
			{
				//System.out.println(j);
				j++;
				if(j >= priceArray.length)
				{
					break;
				}
			}
			i = j-1;
		}*/
		System.out.println(items);
	}
}
