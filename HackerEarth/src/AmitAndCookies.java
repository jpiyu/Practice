
import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class AmitAndCookies {
	static String[] line1;
	static String[] line2;
	static int testCases;
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*try
		{
		//Scanner s = new Scanner(System.in);
		testCases = Integer.parseInt(br.readLine());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		int y =0;
		while(y <testCases)
		{*/
			try
			{
			line1 = br.readLine().split(" ");
			line2 = br.readLine().split(" ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			long[] array = new long[line2.length];
			for(int i=0;i<array.length;i++)
			{
				array[i] = Long.parseLong(line2[i]);
			}
			Arrays.sort(array);
			long cookies = 0;
			int count = 0;
			long amountRemaining = Long.parseLong(line1[1]);
			int i =0;
			while(amountRemaining > 0)
			{
				cookies = cookies + array[i];
				count++;
				if(i == array.length)
				{
					break;
				}
				else
				{
					i++;
				}
				amountRemaining = amountRemaining - array[i];
			}
			/*for(int i=0;i<Integer.parseInt(line1[1]);i++)
			{
				//if(marks + array[array.length-1-i] > Integer.parseInt(s))
				marks = marks + array[array.length-1-i];
			}*/
			System.out.println(count);
			//y++;
		//}
	}
}
