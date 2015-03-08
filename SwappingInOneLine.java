import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class SwappingInOneLine {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		int number1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number");
		int number2 = Integer.parseInt(br.readLine());
		number2 = number1 + number2 - (number1 = number2);
		System.out.println(number1);
		System.out.println(number2);
	}
}
