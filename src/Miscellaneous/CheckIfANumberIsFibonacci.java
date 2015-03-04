package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CheckIfANumberIsFibonacci {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number which you want to check if it is a fibonacci number or not");
		double number = Double.parseDouble(br.readLine());
		if(isSquare(5*number*number + 4) || isSquare(5*number*number - 4))
		{
			System.out.println("the number you entered is a fibonacci number");
		}
		else
		{
			System.out.println("the number you entered is not a fibonacci number");
		}
	}
	static boolean isSquare(double number)
	{
		double x = number;
		double sqrt = Math.sqrt(x);
		if(sqrt*sqrt == number)
		{
			return true;
		}
		return false;
	}
}
