import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class FibonacciUsingRecursion {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int element = findElement(number);
		System.out.println(element);
	}
	static int findElement(int number)
	{
		int first = 0;
		int second = 1;
		int fibonacci = 0;
		if(number == 1 || number == 0)
		{
			return 1;
		}
		else
		{
			fibonacci = findElement(number-2) + findElement(number-1);
			return fibonacci;
		}
	}
}
