import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class ActivitySelection {
	static int[] start = new int[10];
	static int[] end = new int[10];
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<start.length;i++)
		{
			start[i] = Integer.parseInt(br.readLine());
		}
		for(int j=0;j<end.length;j++)
		{
			end[j] = Integer.parseInt(br.readLine());
		}
		int startActivity = 0;
		for(int i=1;i<end.length;i++)
		{
			if(start[i] > end[startActivity])
			{
				System.out.println(i);
				startActivity = i;
			}
		}
	}
}
