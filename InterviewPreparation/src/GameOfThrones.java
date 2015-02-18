import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class GameOfThrones {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int odd = 0;
		int[] array = new int[26];
		for(int i=0;i<str.length();i++)
		{
			array[str.charAt(i) - 'a']++;
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i] % 2 != 0)
				odd++;
		}
		if(odd <= 1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
