import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class EvaluationOfAPostfixExpression {
	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a postfix expression");
		String expression = br.readLine();
		char[] array = expression.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			char c = array[i];
			if(array[i] <= '9' && array[i] >= '0')
			{
				stack.push((int)(array[i]-'0'));
			}
			else
			{

				int num1 = (int)stack.pop();
				int num2 = (int)stack.pop();
				switch(c)
				{
				case '+' :
					stack.push((int)(num1+num2));
					break;
				case '-' :
					stack.push((int)(num1-num2));
					break;
				case '*' :
					stack.push((int)(num1*num2));
					break;
				case '/' :
					stack.push((int)(num1/num2));
					break;
				case '^' :
					stack.push((int)(Math.pow(num2,num1)));
					break;
				}
			}
		}
		System.out.println((int)stack.pop());
	}
}