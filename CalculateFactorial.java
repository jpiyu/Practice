import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CalculateFactorial {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		System.out.println(findFactorial(number));
	}
	static int findFactorial(int number)
	{
		int answer = 0;
		for(int i=number-1;i>0;i--)
		{
			//System.out.println("i : " + i);
			answer = number;
			for(int j=0;j<i-1;j++)
			{
				//System.out.println("j : " + j);
				answer = answer + number;
			}
			//System.out.println("answer : " + answer);
			number = answer;
			//System.out.println("number : "+ number);
		}
		return number;	
	}
}
