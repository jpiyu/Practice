import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindingPowerInLogarithmicTime {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base number");
		int base = s.nextInt();
		System.out.println("Enter the power upto which it is to be calculated");
		int power = s.nextInt();
		int answer = calculate(base,power);
		System.out.println(answer);
	}
	static int calculate(int base,int power)
	{
		int temp = 0;
		if(power == 1)
		{
			return base;
		}
		temp = calculate(base,power/2);
		if(power%2 == 0)
		{
			return temp*temp;
		}
		else
		{
			return base*temp*temp;
		}
	}
}
