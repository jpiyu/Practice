import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ConvertingInfixToPostfix {
	static Stack<Character> stack = new Stack<>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the expression");
		String expression = br.readLine();
		char array[] = new char[expression.length()];
		array = expression.toCharArray();
		char[] postfix = new char[expression.length()];
		for(int i=0;i<postfix.length;i++)
		{
			postfix[i] = ' ';
		}
		int trackerForPostfixArray = 0;
		for(int i=0;i<expression.length();i++)
		{
			char temp;
			char ch = array[i];
			switch(ch)
			{
			case '(' :
				stack.push(ch);
				break;
			case ')' :
				while((temp = stack.pop()) != '(')
				{
					postfix[trackerForPostfixArray++] = temp;
				}
				break;
			case '+' :
			case '-' :
			case '*' :
			case '/' :
			case '^' :
				while(!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(ch))
				{
					postfix[trackerForPostfixArray++] = stack.pop();
				}
				stack.push(ch);
				break;
			default :
				postfix[trackerForPostfixArray++] = ch;
				
			}
			
		}
		for(int i=0;i<postfix.length;i++)
		{
			System.out.print(postfix[i]);
		}
		
	}
	static int getPriority(char c)
	{
		switch(c)
		{
		case '(' :
			return 0;
		case '+':
		case '-':
			return 1;
		case '/' :
		case '*' :
			return 2;
		case '%' :
			return 3;
		case '^' :
			return 4;
		}
		return 0;
	}
}
