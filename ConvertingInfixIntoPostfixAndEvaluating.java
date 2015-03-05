import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class ConvertingInfixIntoPostfixAndEvaluating {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expression = br.readLine();
		char[] array = expression.toCharArray();
		char[] postfix = new char[array.length];
		for(int i=0;i<postfix.length;i++)
		{
			postfix[i] = ' ';
		}
		for(int i=0;i<array.length;i++)
		{
			char c = array[i];
			switch(c)
			{
			
			}
		}
	}
}
