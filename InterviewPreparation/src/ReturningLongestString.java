import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class ReturningLongestString {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		findMaxLengthString(line);
	}
	static void findMaxLengthString(String line)
	{
		String[] str = line.split(" ");
		//for(int i=0;i<str.length;i++)
		//{
			int max = 0;
			for(int j=1;j<str.length;j++)
			{
				if(str[max].length() < str[j].length())
				{
					max = j;
				}
			}
		//}
			System.out.println(str[max]);
	}
}
