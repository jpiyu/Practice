
import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class FlippingBits {
	static String[] line1;
	static String[] line2;
	static long testCases;
	static long[] array;
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		//Scanner s = new Scanner(System.in);
		testCases = Long.parseLong(br.readLine());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		int y =0;
		while(y <testCases)
		{
			try
			{
			line1 = br.readLine().split(" ");
			line2 = br.readLine().split(" ");
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			array = new long[line2.length];
			for(int i=0;i<array.length;i++)
			{
				array[i] = Long.parseLong(line2[i]);
			}
			Arrays.sort(array);
			long marks = 0;
			long timeRemaining = Long.parseLong(line1[1]);
			int i =0;
			while((timeRemaining > 0) && (i < array.length))
			{
				
				marks = marks + array[array.length-1-i];
				
				i++;
				
				timeRemaining--;
			}
			/*for(int i=0;i<Integer.parseInt(line1[1]);i++)
			{
				//if(marks + array[array.length-1-i] > Integer.parseInt(s))
				marks = marks + array[array.length-1-i];
			}*/
			System.out.println(marks);
			y++;
		}
	}
}
