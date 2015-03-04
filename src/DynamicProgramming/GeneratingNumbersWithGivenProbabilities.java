package DynamicProgramming;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class GeneratingNumbersWithGivenProbabilities {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers");
		String[] str = br.readLine().split(" ");
		int[] numbers = new int[str.length];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter the corresponding probabilities of the numbers");
		String[] str2 = br.readLine().split(" ");
		int[] probabilities = new int[str2.length];
		for(int i=0;i<probabilities.length;i++)
		{
			if(i == 0)
			{
				probabilities[0] = Integer.parseInt(str[0]);
			}
			else
			{
				probabilities[i] = Integer.parseInt(str2[i]) + Integer.parseInt(str2[i-1]);
			}
		}
		Random r = new Random();
		int number = r.nextInt(100);
		if(number <= probabilities[0])
		{
			System.out.println(numbers[0]);
			return;
		}
		else if(number <= probabilities[1])
		{
			System.out.println(numbers[1]);
			return;
		}
		else if(number <= probabilities[2])
		{
			System.out.println(numbers[2]);
			return;
		}
	}
}
