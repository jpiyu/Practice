import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class AddTwoNumbersWithoutAdditionOperator {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		int number1 = Integer.parseInt(br.readLine());
		int number2 = Integer.parseInt(br.readLine());
		int sum = add(number1,number2);
		System.out.println(sum);
	}
	static int add(int x,int y)
	{
		while(y > 0)
		{
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
}
