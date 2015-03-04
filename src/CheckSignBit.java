import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class CheckSignBit {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers one by one");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		//System.out.println((num1 ^ num2) >> 31);
		if(((num1 ^ num2) >> 31) == 1 || ((num1 ^ num2) >> 31) == -1)
		{
			System.out.println("different signs");
			return;
		}
			System.out.println("same signs");
	}
}
