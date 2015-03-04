import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class DivisibilityBy7 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("program to check divisibilty by 7");
		System.out.println("Please enter the number of which you want to check the divisibilty");
		int number = Integer.parseInt(br.readLine());
		boolean checkStatus = checkDivisibility(number);
		if(checkStatus){
			System.out.println("number you entered is divisible by 7");
		}else
		{
			System.out.println("number you entered is not divisible by 7");
		}
	}
	public static boolean checkDivisibility(int number)
	{
		if(number < 0)
		{
			return checkDivisibility(-number);
		}
		if(number == 0 || number == 7)
		{
			return true;
		}
		if(number < 10)
		{
			return false;
		}
		else 
		{
			return checkDivisibility(number/10 - (2 * number%10));
		}
	}
}
