import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindingPowerInLogarithmicTime {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base number");
		double base = s.nextDouble();
		System.out.println("Enter the power upto which it is to be calculated");
		double power = s.nextDouble();
		double answer = calculate(base,power);
		System.out.println(answer);
	}
	static double calculate(double base,double power)
	{
		double temp = 0;
		if(power == 0)
		{
			return 1;
		}
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
			if(power > 0)
			{
				return base*temp*temp;
			}
			else
			{
				return (temp*temp)/base;
			}
		}
	}
}
