import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class BalanceOfParenthesis {
	public static void main(String[] args) throws Exception
	{
		Stack<Character> stack = new Stack<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the string comprising the brackets");
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == '{' || c == '(' || c== '[')
			{
				stack.push(c);
			}
			else if(c == '}' || c == ')' || c == ']')
			{
				int priority1 = getPriority(c);
				int priority2 = getPriority(stack.peek());
				if(priority1 == priority2)
				{
					stack.pop();
				}
			}
		}
		if(stack.size() == 0)
		{
			System.out.println("balanced parenthesis");
			return;
		}
		else
			System.out.println("Unbalanced Parenthesis");
		
	}
	static int getPriority(char c)
	{
		if(c == '{' || c == '}')
		{
			return 2;
		}
		else if(c == '(' || c == ')')
		{
			return 1;
		}
		else if(c == '[' || c == ']')
		{
			return 0;
		}
		return -1;
	}
}
