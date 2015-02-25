package Miscellaneous;
import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FindingIfMultipleOf3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("insert the number to check");
		int number = Integer.parseInt(br.readLine()); 
		int oddCount=0,evenCount=0;
		while(number != 0)
		{
			if((number & 1) != 0)
			{
				oddCount++;
			}
			number = number >> 1;
			
			if((number & 1) != 0)
			{
				evenCount++;
			}
			number = number >> 1;
		}
		if((oddCount - evenCount) % 3 == 0)
		{
			System.out.println("the number you entered is a multiple of 3");
			return;
		}
		System.out.println("the number you entered is not a multiple of 3");
	}
}
