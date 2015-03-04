import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SwapTwoNumbersWithoutTemporaryNumber {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		swapMethod1(num1,num2);
		swapMethod2(num1,num2);
		swapMethod3(num1,num2);
	}
	static void swapMethod1(int x,int y)
	{
		System.out.println("The numbers before swapping are : " + x + " " + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("The numbers after swapping are : " + x + " " + y);
	}
	static void swapMethod2(int x,int y)
	{
		System.out.println("The numbers before swapping are : " + x + " " + y);
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println("The numbers after swapping are : " + x + " " + y);
	}
	static void swapMethod3(int x,int y)
	{
		System.out.println("The numbers before swapping are : " + x + " " + y);
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println("The numbers after swapping are : " + x + " " + y);
	}
}
