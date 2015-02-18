import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class LuckyNumbers {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int counter = 2;
		if(isLucky(num,counter))
		{
			System.out.println("the number is lucky");
		}
		else
		{
			System.out.println("the number is not lucky");
		}
	}
	public static boolean isLucky(int num,int counter)
	{
		//int counter = 2;
		int next_position = num;
		if(counter > num)
		{
			return true;
		}
		if(num%counter == 0)
		{
			return false;
		}
		next_position -= next_position/counter;
		counter++;
		return isLucky(next_position,counter);
	}
}
