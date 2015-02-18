import static java.lang.System.*;

import java.util.*;
import java.io.*;
public class EvaluatingValueOfExpression {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		for(int i=1;i<input.length;i++)
		{
			input[i-1] = input[i];
		}
		String operators = "+-/*";
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<input.length-1;i++)
		{
			String c = input[i];
			System.out.println(c);
			if(!operators.contains(c))
			{
				stack.push(c);
			}
			else
			{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch(c)
				{
				case "+":
					stack.push(String.valueOf(a+b));
					break;
				case "-":
					stack.push(String.valueOf(a-b));
					break;
				case "*":
					stack.push(String.valueOf(a*b));
					break;
				case "/":
						stack.push(String.valueOf(a/b));
						
				}
			}
		}
		int result = Integer.valueOf(stack.pop());
		System.out.println(result);
	}
}	
