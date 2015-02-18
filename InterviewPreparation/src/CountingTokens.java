import static java.lang.System.*;

import java.util.StringTokenizer;
public class CountingTokens {
	public static void main(String[] args)
	{
		StringTokenizer stk = new StringTokenizer("my name is piyush joshi");
		while(stk.hasMoreElements())
		{
			System.out.println(stk.countTokens());
			System.out.println(stk.nextToken());
			System.out.println();
		}
	}
}
