import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class MaximizingXOR2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num1 = Integer.valueOf(s.nextLine());
		int num2 = Integer.valueOf(s.nextLine());
		
		int max = Integer.MIN_VALUE;
		for(int i=num1;i<=num2;i++)
		{
			for(int j=num1;j<=num2;j++)
			{
				if((i^j) > max)
				{
					max = i^j;
				}
			}
		}
		System.out.println(max);
	}
}
