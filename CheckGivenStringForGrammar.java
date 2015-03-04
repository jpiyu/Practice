import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class CheckGivenStringForGrammar {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String text = br.readLine();
		int previousState =0 ,currentState = 0;
		int finalState = 3;
		if(isBetween(text.charAt(0),'A','Z'))
		{
			previousState = currentState;
			currentState = 1;
			System.out.println(currentState);
		}
		for(int i=1;i<text.length()-1;i++)
		{
			if(isBetween(text.charAt(i),'a','z') || text.charAt(i) == ' ')
			{
				previousState = currentState;
				currentState = 2;
			}
			else
			{
				currentState = 1;
			}
		}
		if(text.charAt(text.length()-1) == '.')
		{
			previousState = currentState;
			currentState = 3;
		}
		System.out.println(currentState);
		if(currentState == finalState)
		{
			System.out.println("The string you have entered follows the grammar specified");
		}
		else
		{
			System.out.println("The string you have entered does not follow the grammar specified");
		}
	}
	static boolean isBetween(char c,char low,char high)
	{
		int lowIndex = (int)low;
		int highIndex = (int)high;
		int toFind = (int)c;
		if(c < highIndex && c > lowIndex)
		{
			return true;
		}
		return false;
	}
}
