import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class NewMethodForMultiplication {
	static int[] res;
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		res = new int[20];
		System.out.println("enter the size of the number");
		int size = s.nextInt();
		for(int i=0;i<size;i++)
		{
			res[i] = s.nextInt();
		}
		/*for(int i=0;i<size;i++)
		{
			System.out.println(res[i]);
		}*/
		
		System.out.println("Enter the multiplier");
		int multiplier = s.nextInt();
		int carry = 0;
		int temp = 0;
		for(int i=0;i<size;i++)
		{
			temp = res[i]*multiplier + carry;
			res[i] = temp%10;
			carry = temp/10;
		}
		while(carry > 0)
		{
			res[size++] = carry%10;
			carry /= 10;
		}
		for(int i=0;i<=size;i++)
		{
			System.out.println(res[i]);
		}
	}
}
