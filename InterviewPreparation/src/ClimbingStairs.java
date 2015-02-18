import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ClimbingStairs {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int climbingUp = Integer.parseInt(str[0]);
		int comingDown = Integer.parseInt(str[1]);
		Long numberOfStairs = Long.parseLong(str[2]);
		int days =0;
		int totalStairs = 0;
		while( totalStairs < numberOfStairs)
		{
			totalStairs = totalStairs + climbingUp;
			days++;
			if(totalStairs == numberOfStairs)
			{
				break;
			}
			totalStairs = totalStairs - comingDown;
		}
		System.out.println(days);
	}
}
