import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Dhoom4 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int samarpitsKey = Integer.parseInt(str[0]);
		int locksValue = Integer.parseInt(str[1]);
		int numberOfOtherKeys = Integer.parseInt(br.readLine());
		String[] val = br.readLine().split(" ");
		int[] values = new int[val.length];
		for(int i=0;i<val.length;i++)
		{
			values[i] = Integer.parseInt(val[i]);
		}
		//Arrays.sort(values);
		int time = 0;
		int product1=0,product2=0;
		int copy1 = samarpitsKey;
		int copy2 = samarpitsKey;
		for(int i=0,j=values.length-1;i<values.length || j>= 0;i++,j--)
		{
			int x = values[i];
			int y = values[j];
			product1 = (x*copy1)%100000;
			product2 = (y*copy2)%100000;
			copy1 = product1;
			copy2 = product2;
			time++;
			//System.out.println("product1 " + product1 + "  " + "product2 " + product2);
			if(product1 == locksValue || product2 == locksValue)
			{
				break;
			}
		}
		//System.out.println(values.length);
		if(time != values.length)
		{
		System.out.println(time);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
