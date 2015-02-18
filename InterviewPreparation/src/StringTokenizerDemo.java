import static java.lang.System.*;

import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[] args)
	{
		String str = new String("my name is piyush joshi");
		StringTokenizer stk = new StringTokenizer(str);
		while(stk.hasMoreElements())
		{
			System.out.println(stk.nextToken());
		}
	}
}
